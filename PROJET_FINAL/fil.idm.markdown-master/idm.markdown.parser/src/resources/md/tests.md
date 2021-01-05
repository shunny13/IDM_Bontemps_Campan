# File for tests markdown parser

# Table 


| Syntax      | Description |
|:----------- | ----------- |
| Header      | Title       |
| Paragraph   | Text        |

| Syntax      | Description |
| ----------- | ----------- |
| Header      | Title       |
| Paragraph   | Text        |


|    Heading Centered    | Heading Left Aligned   |  Heading Centered  |   Heading Right Aligned |
|------------------------|:-----------------------|:------------------:|------------------------:|
| Cell text left aligned | Cell text left aligned | Cell text centered | Cell text right aligned |
| cell 21                | cell 22                |      cell 22       |                 cell 22 |

See syntax and option :
[Tables Extension](https://github.com/vsch/flexmark-java/wiki/Tables-Extension)

# Text, Strong, Emphasis

Test **ceci est un phrase en strong avec des _italiques_ et un [lien](#)**.

Ce paragraphe contient un **Strong** et un *Italique*. Il passe a la
ligne.

Les [Textes des liens peuvent auusi contenir des *Strong** et des *Italiques*](#).

# Test Link, LinkRef et Reference

Ceci est un Link avec un Strong dans le titre : [A **Link**](#)

Ceci est un LinkRef : [My **linkref**][tests]

Un LinkRef contient un identifiant (ici 'tests' appelé reference. Le Reference correspondante est déclarée à la ligne suivante :

[tests]: http://search.msn.com/    (MSN Search)

Ceci est une [utilisation de ref][uref]

[uref]: http://search.msn.com/ (uref test) 


Markdown supports two style of links: inline and reference.
In both styles, the link text is delimited by [square brackets].

## Inline Links Doc
To create an inline link, use a set of regular parentheses immediately after the link text’s closing square bracket. Inside the parentheses, put the URL where you want the link to point, along with an optional title for the link, surrounded in quotes. For example:

````
This is [an example](http://example.com/ "Title") inline link.

[This link](http://example.net/) has no title attribute.
````

Will produce:

````
<p>This is <a href="http://example.com/" title="Title">
an example</a> inline link.</p>

<p><a href="http://example.net/">This link</a> has no
title attribute.</p>
````

If you’re referring to a local resource on the same server, you can use relative paths:

````
See my [About](/about/) page for details.   
````
## Inline links tests

This is [an example](http://example.com/ "Title") inline link.

[This link](http://example.net/) has no title attribute.

See my [About](/about/) page for details.   

## Reference Links Docs

Reference-style links use a second set of square brackets, inside which you place a label of your choosing to identify the link:

````
This is [an example][id] reference-style link.
````

You can optionally use a space to separate the sets of brackets:

````
This is [an example] [id] reference-style link.
````

Then, anywhere in the document, you define your link label like this, on a line by itself:

````
[id]: http://example.com/  "Optional Title Here"
````
That is:

- Square brackets containing the link identifier (optionally indented from the left margin using up to three spaces);
- followed by a colon;
- followed by one or more spaces (or tabs);
- followed by the URL for the link;
- optionally followed by a title attribute for the link, enclosed in double or single quotes, or enclosed in parentheses.

## Reference Links Tests

This is [an example][id] reference-style link.

This is [an example] [id] reference-style link with space. **It doesn't work with our parser**.

Definitions of the id:
[id]: http://example.com/  "Optional Title Here"

## References = Link definition Docs
When you specify the link with an ID, you must then define this ID.
The definition of the ID is called a ``Reference``

References can be placed anywhere in your Markdown document. I tend to put them immediately after each paragraph in which they’re used, but if you want, you can put them all at the end of your document, sort of like footnotes.


Link def :

````
I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].
````

References defs : 

````
  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"
````
## References = Link definition Tests

I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"

The following three link definitions are equivalent (next line is not visible in final view):

[foo]: http://example.com/  "Optional Title Here"
[foo]: http://example.com/  'Optional Title Here'
[foo]: http://example.com/  (Optional Title Here)

This is a link ref with implicit link [google][]

Then the definition is (next line is not visible in final view): 

[Google]: http://google.com/

# Code

To produce a code block in Markdown, simply indent every line of the block by at least 4 spaces or 1 tab. For example, given this input:

This is a normal paragraph:

    This is a code block.
    On several line
    
    And even with a blank line
    
    [link in code](#)

````
Code en debut de ligne

Avec \`\`\`\`
Comme separateur
  [link in code](#)

````

A paragraphe with ````inline code [link in code](#)```` and an end.

This is a paragraphe.
It continue on this line

This is a 2nd paragraphe.

## Title level 2

Hello the world.

## 2 Title level 2

A line with **strong** and an *italic*.
Et aussi un *mix*.


A line with double space at the end  

A normal line.

# Links

A paragraph with a  [link](#) not at the end.

[A link](#)at beginning of text.

Try [**strong** title](https://wiki.eclipse.org/The_Official_Eclipse_FAQs#Workspace_and_Resources_API).

Now, try [image ![image](https://www.eclipse.org/images/egg-incubation.png) ](https://wiki.eclipse.org/The_Official_Eclipse_FAQs#Workspace_and_Resources_API).

And now an image : ![image](https://www.eclipse.org/images/egg-incubation.png)

And finally a [linkwith title](# "title")


# Title level 1

List :

- start list. This is a paragraph
  on multiple lines.
  
  And another paragraph
- item 2.
  * level 2 item 1
  * level 2 item 2
  - level 2 item 3
    - level 3 item 1
    - level 3 item 2
    - level 3 item 3
    - level 4 item 1
        - next level ??
  - level 2 item 4
  - level 2 item 5
  
un paragraphe 
	  
# Try Citation
Citation :

> Start citation
> > double citation
> > - list in citation
> > - item 2
> > - item 3
> > fin de list
> > 

# Titre avec un [lien](#) et un *italic**

Un dernier paragraphe.

# Lines

* * *

----------------------

*************

- - -



