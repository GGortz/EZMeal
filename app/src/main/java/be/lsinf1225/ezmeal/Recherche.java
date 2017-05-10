package be.lsinf1225.ezmeal;

/**
 * Created by Gaetan on 02/05/2017.
 */

public class Recherche {

  int complexité; //sur 5 étoiles, complexité de la recette
  String dateMin;//date d'ajout minimale sous la forme '2016-07-01' pr sql
  String dateMax;//date d'ajout maximale
  int tempsCuissonMin;//temps minimal cuisson
  int tempsCuissonMax;//temps maximal cuisson
  int tempsPrepaMin;//temps minimal preparation
  int tempsPrepaMax;//temps maximal preparation
  String typePlat; //"Apéritif" ou "Principal" ou "Dessert"
  String prix;// "Bon Marché" ou "Moyen" ou "Elevé"
  int nPerso;//nombre de couverts
}
