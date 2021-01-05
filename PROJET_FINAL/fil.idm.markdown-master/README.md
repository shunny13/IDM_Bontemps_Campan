# Mardown file to Mardown Model converter

**Features :**
- A Markdown metamodel in EMF
- A Markdown file to Mardown model converter
- A UI allowing to run the tool from Eclipse menus

# Table of Content

[TOC]

# GIT repository

https://gitlab-ens.fil.univ-lille1.fr/dumoulin/fil.idm.markdown

# Usages

- Select one or more ``.md`` files, or a directory containing some ``.md`` files.
- ``Right Click -> Markdown -> Markdown Parser``
- Or click the icon ![](assets/README-b11a1a60.png) in toolbar.

**Warning:** If you have installed the Markdown converter by dowloading the projects, you should start the converter in a second Eclipse, started with ``Run As -> Eclipse Application``.

## Options
**Generate multiple models on multiple selection**
Set this option to ``true`` when you want to generate one model for each selected file.
Set this option to ``false`` when you want to generate one single model containing all parsed Document in case of multiple files selection.

**Create a root ``Folder``**
The Markdown Model generator can create a ``Folder`` object at the root of the generated model. If this ``Folder``exist, it is used to store the parsed ``Document``.
Set the following option according to your needs :
- ``Always`` - A ``Folder`` is always created in the generator model.
- ``Never`` - No ``Folder`` is generated.
- ``If Needed`` - ``Folder`` is generated if multiple documents are parsed.

You can set the options in the preference page, under ``Markdown File to Model`` :
![](assets/README-34e2f378.png)

# Markdown metamodel

## Main concepts
![](assets/README-f8c16ce4.png)

All concepts, except ``Folder`` are from the Markdown AST.
A Markdown document start with a ``Document``. A ``Document`` can contains ``Block``
which are ``Paragraph``, ``Title``, ``CodeBlock``, ``List``, ``BlockQuote`` ...
All this kind of concept start at the beginning of a line in the file.

A ``Paragraph`` and ``Title`` are composed of ``TextElement``, described later.

A ``List`` is composed of ``ListItem``. In Markdown file, list items start with ``-``or ``*``.
A ``ListItem`` can contains ``Paragraph``, ``CodeBlock``and ``List`` This elements are identified thanks to the ``ListItemElement``interface.

    * Example of List and ListItem
    * item 2
      * sublist
      * item in sublist
    * item on
      multiple lines
    * item 3
      ````
      code in item
      ````


``CodeBlock`` is made of line of code that are normally left unchanged by Markdown renderers.


     ````
     Example of CodeBlock.
     ````


``BlockQuote`` can contains any elements a ``Document`` can contains. ``BlockQuote`` starts with any numbers of `>` at start of line.

    >> Example of BlockQuote

## Text Concepts
![](assets/README-45187a46.png)

In Markdown, nearly all lines of text are composed of ``Textelement``. A ``Textelement``can be
a ``Text``, an inline ``Code`` , a text in **strong** ``StrongEmphasis``, in *italic* ``Emphasis``. ``Links``, ``Image`` and link reference ``LinkWithRef`` are also ``TextElement``.


## Table Concepts

![](assets/README-618fd2f2.png)

A Table contains 3 kind of sections : ``TableHead``, ``TableSeparator`` and ``TableBody``.
Each of this section contains ``TableRow`` describing a Row.
A row is made of ``TableCells``, which is of subclass of ``TextContainer``. So, a ``TableCell`` can contains any Text.

# Markdown Files examples

Some examples in markdown can be found in the project under ``/idm.markdown.parser/src/resources/md``

The following Test file is used to test the converter.
So, all the markdown constructions found in this file are recognized by the converter, and translated to the model.

**Test file :**

https://gitlab-ens.fil.univ-lille1.fr/dumoulin/fil.idm.markdown/-/blob/master/idm.markdown.parser/src/resources/md/tests.md

# Installation

Actually, the installation can only be done from sources.

## Prerequisites

- Eclipse Modeling (with EMF)


## Installation from sources

To install the tools, downloads all the projects from GIT and import them in an *Eclipse Workspaces*. Then the tools are availables in a second Eclipse launched with  ````Run As -> Eclipse Application````

### Install by importing GIT repository from Eclipse

Copy the GIT URL, then in your Eclipse workbench :
- ``Import... -> Git -> Projects from Git (with smart import)``
- ``Clone URI``
- Set GIT URI, User and Password
- ![](assets/README-ddf95989.png)
- Choose master branch
- Select a location for the local git repo.
  - Avoid a location in the workbench tree
  - Prefer a separate location
  - Check imported projects, unsellect ``fil.idm.markdown`` (this is the root folder, not a project).
- ![](assets/README-27c3511b.png)
- Finish

### Install from a zip file

- Download projects as a zip file
- Uncompress projects at the root of your Eclipse Workspace
- Open Eclipse
- ``Import ... -> General -> Existing Projects into Workspace``
- ``Select root directory``, Browse to the root directory where you have uncompressed your files
- ![](assets/README-13c1c1a3.png)

# History

## 2020 12 17
- Add options to create Folder
- Add option to parse into single or multiple files
- Rename some files
- Remove unused files


## 2020 12 11
- Change metamodel
  - ``StrongEmphasis`` and ``Emphasis`` are now subclasses of CompositeTextElemnts
- Add table capabilities
- Add ``RefLink`` and ``Reference``
-
## 2020 12 4
- Initial release
