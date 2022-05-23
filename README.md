# Projet Périscolaire

## Commandes pour naviguer dans le terminal

Pour vous rendre dans un dossier particulier, vous devez indiquer après la commande `cd` le chemin du dossier en question.

> **Exemple :**
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~
> $ cd ../../
> ```
> 
> Je me rends de le dossier père du dossier père, s'il existe (vous pouvez ajouter autant de `../` qu'il y a de dossiers pères - jusqu'à la racine).
> 
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~
> $ cd OneDrive/Bureau/
> ```
> 
> Je me rends dans le dossier `OneDrive`, puis dans le dossier `Bureau`.
> 
> Pour aller plus vite et pour être sûr que votre dossier existe et que vous êtes au bon endroit, vous pouvez appuyer sur la touche `Tab` avant d'avoir fini d'écrire le nom du dossier. S'il n'y a pas de réaction, c'est que votre dossier n'existe pas ou qu'il y a plusieurs noms de dossiers qui commencent par les mêmes caractères. Vous pouvez appuyez deux fois sur `Tab` pour voir s'il y a bien des dossiers avec des noms similaires.

### Création de dossiers/fichiers

Vous pouvez définir un nouvel emplacement pour le projet que vous allez cloner en créant un nouveau dossier avec `mkdir`. Et pour créer des fichier, utiliser `touch`.

> **Exemple :**
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau
> $ mkdir nouveauDossier
> tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau
> $ cd nouveauDossier/
> tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/nouveauDossier
> $ touch nouveauFichier
> ```
> 
> `~` est le dossier racine pris en compte par votre terminal, ce qui est différent du dossier racine de votre ordinateur.
> 
> Si vous voulez vous placer dans un dossier qui n'est pas à l'intérieur de votre racine, vous devez utliser un `cd` vers les dossiers cibles (pères en l'occurence) en utilisant `cd ../..` etc.

Vous pouvez vérifier votre emplacement à tout moment en utilisant la  commande `pwd`

> **Exemples :**
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau
> $ pwd
> /c/Users/tagbi/OneDrive/Bureau
> ```

## Manipulation du dépôt

### Récupération du dépôt

Pour récupérer le dépôt, placer vous dans le dossier dans lequel vous voulez qu'il soit, et entrez la commande suivante :
```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire
$ git clone https://github.com/TogjiTL/Periscolaire.git
```
### Récupération des modifications

Avant de faire une modification quand le projet est commencé, ou souvent modifié, pensez à récupérer les modifications (même s'il n'y a rien de nouveau) :

```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ cd Periscolaire
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/Periscolaire
$ git pull
```
### Déposer des modifictions

Pour émettre des ajouts/modifications sur le dépôt git, plusieurs solutions :

- On peut se placer à la racine du projet (ici *Periscolaire*) et entrer la commande `git add .` ;
- On peut se placer dans le dossier contenant le fichier modifié (ou directement entrer la commande suivi du chemin) et entre `git add *fichier*`.

```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git add .
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git commit -m "*message/commentaire pertinent*"
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git push
```
