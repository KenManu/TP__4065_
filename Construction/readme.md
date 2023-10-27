# Design pattern

### La navigation dans le tp
    Le tp est contenu dans un package, a l'interieur se trouve le package Construction qui comprend tous les pattern de construction 02 exemples notamment 
* Factory
* Abstract Factory
* Singleton
* Builder
* Prototype

> Pour chacun des pattern nous avons la version vu en cours et la version modifier.
> La version vu en cours est comporte en "1" apres le nom de la methode et celle modifiee un "2"

>En ce qui conserne la methode prototype on a on a un seul modele qui est un exemple personnel ci-dessous plus de details sur la methode

## Prototype

### Objectif :
    Le Prototype est donc un modèle de création qui repose sur le principe de clonage. En effet, il permet de créer de nouveaux objets à partir d’objets existants sans rendre le code dépendant de leur classe.

### Cas d'utilisation:
    Dans tout programme, nous créons un ensemble d’objets configurés de différentes manières. Lorsqu’on a besoin d’un objet tel que celui qu’on a configuré, il suffit de cloner un Prototype plutôt que de construire un nouvel objet à partir de rien.

### Participants:
      Le modèle utilise des classes abstraites et seulement trois types différents afin de faciliter son implémentation (voir schéma ci-dessous) :

    *** Client : créé un nouvel objet en demandant à un prototype de se cloner ;

    **  Prototype : déclare une interface pour se cloner ;

    *   PrototypeConcret : implémente l’opération pour le clonage lui-même.


## Comment run le tp:
> Pour build le projet il suffit d'ouvrir tout le dossier code enfin que le package construction soit reconnu
> et la vous pourrez lancer la classe Client de chaque pattern 
> 

 
>on a egalement le dossier modeles comportant tout les diagrammes des pattern vu en en cours mais modifier 
> le pdf comprend aussi le modele generique de prototype