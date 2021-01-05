# Installer Papyrus pour IDM et Projects

Vous pouvez installer Papyrus sur votre machine Windows, Linux et Mac.
Dans les cours, nous utilisons Papyrus et d'autres fonctionalités comme Acceleo, Sirius, XText ...

Pour avoir la même configuration que au M5, vous devez installer les projets Eclipses suivants (voir plus loin pour comment le faire):

- Eclipse modeling
- Papyrus
- Papyrus Designer (génération de code Java)
- Acceleo (Model to Text)
- Sirius (Modeleur Graphique)
- XText (pour écrire des DSL)

Pour **l'année 2020-2021**, la version du M5 est **Eclipse Modeling 2020-06**

  ATENTION : Ce n'est pas la toute dernière version d'Eclipse. En effet, la dernière version d'Eclipse est incompatible avec Papyrus (le Model Explorer n'apparait pas).

# Comment installer les projets Eclipses:

Vous devez commencer par installer Eclipse Modeling.

 - [Installer Eclipse Modeling et Papyrus](installerPapyrus.html)
 - Installer Papyrus Designer (générateur de code Java)
   - Faites un Drag du bouton suivant vers votre installation de Eclipse
   - [![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.svg)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3724955 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")
    - Ou [Installer Papyrus Designer](installerPapyrusDesigner.html)

 - Installer Acceleo
   - [![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.svg)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=195 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")
   - ou https://www.eclipse.org/acceleo/download.html
   - ou Utiliser le Marketplace : Acceleo


 - Installer Sirius
   - [![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.svg)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1318261 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")
   - Ou https://www.eclipse.org/sirius/download.html
   - Ou utiliser le Marketplace : Sirius


 - Installer XText
   - [![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.svg)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1073 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")
   - Ou Utiliser le Marketplace : XText

- Installer **ATL (Model Transformation Language)**
  - Il faut utiliser l'`update site`
  - A trouver ici : https://www.eclipse.org/atl/downloads/
    - Pour 2020-21:
      - https://download.eclipse.org/mmt/atl/updates/releases
  - Copiez l'URL de l'updatesite (ou ouvrez la pour avoir un mode d'emploi)
  - Dans Eclipse :
    - `Help -> Install New Softwares`
    - collez l'URL dans `Work with:`
    - `Next` ...


- Installer **QVTo**
  - Il faut utiliser l'`update site`
  - A trouver ici : https://projects.eclipse.org/projects/modeling.mmt.qvt-oml/downloads
    - Pour 2020-21:
      - https://download.eclipse.org/mmt/qvto/updates/releases
  - Copiez l'URL de l'updatesite (ou ouvrez la pour avoir un mode d'emploi)
  - Dans Eclipse :
    - `Help -> Install New Softwares`
    - collez l'URL dans `Work with:`
    - `Next` ...
