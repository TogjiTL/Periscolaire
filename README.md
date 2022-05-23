# Projet P�riscolaire

## Commandes pour naviguer dans le terminal

Pour vous rendre dans un dossier particulier, vous devez indiquer apr�s la commande `cd` le chemin du dossier en question.

> **Exemple :**
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~
> $ cd ../../
> ```
> 
> Je me rends de le dossier p�re du dossier p�re, s'il existe (vous pouvez ajouter autant de `../` qu'il y a de dossiers p�res - jusqu'� la racine).
> 
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~
> $ cd OneDrive/Bureau/
> ```
> 
> Je me rends dans le dossier `OneDrive`, puis dans le dossier `Bureau`.
> 
> Pour aller plus vite et pour �tre s�r que votre dossier existe et que vous �tes au bon endroit, vous pouvez appuyer sur la touche `Tab` avant d'avoir fini d'�crire le nom du dossier. S'il n'y a pas de r�action, c'est que votre dossier n'existe pas ou qu'il y a plusieurs noms de dossiers qui commencent par les m�mes caract�res. Vous pouvez appuyez deux fois sur `Tab` pour voir s'il y a bien des dossiers avec des noms similaires.

### Cr�ation de dossiers/fichiers

Vous pouvez d�finir un nouvel emplacement pour le projet que vous allez cloner en cr�ant un nouveau dossier avec `mkdir`. Et pour cr�er des fichier, utiliser `touch`.

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
> `~` est le dossier racine pris en compte par votre terminal, ce qui est diff�rent du dossier racine de votre ordinateur.
> 
> Si vous voulez vous placer dans un dossier qui n'est pas � l'int�rieur de votre racine, vous devez utliser un `cd` vers les dossiers cibles (p�res en l'occurence) en utilisant `cd ../..` etc.

Vous pouvez v�rifier votre emplacement � tout moment en utilisant la  commande `pwd`

> **Exemples :**
> ```bash
> tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau
> $ pwd
> /c/Users/tagbi/OneDrive/Bureau
> ```

## Manipulation du d�p�t

### R�cup�ration du d�p�t

Pour r�cup�rer le d�p�t, placer vous dans le dossier dans lequel vous voulez qu'il soit, et entrez la commande suivante :
```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire
$ git clone https://github.com/TogjiTL/Periscolaire.git
```
### R�cup�ration des modifications

Avant de faire une modification quand le projet est commenc�, ou souvent modifi�, pensez � r�cup�rer les modifications (m�me s'il n'y a rien de nouveau) :

```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ cd Periscolaire
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/Periscolaire
$ git pull
```
### D�poser des modifictions

Pour �mettre des ajouts/modifications sur le d�p�t git, plusieurs solutions :

- On peut se placer � la racine du projet (ici *Periscolaire*) et entrer la commande `git add .` ;
- On peut se placer dans le dossier contenant le fichier modifi� (ou directement entrer la commande suivi du chemin) et entre `git add *fichier*`.

```bash
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git add .
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git commit -m "*message/commentaire pertinent*"
tagbi@LAPTOP-VIUROA8L MINGW64 ~/OneDrive/Bureau/Periscolaire/
$ git push
```
