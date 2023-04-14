import { Component } from '@angular/core';
import { Recipe } from '../recipe-model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent {

  recipe:Recipe[] = [
    new Recipe("A Test Recipe","This is simply a test","https://cdn.pixabay.com/photo/2010/12/13/10/05/berries-2277_960_720.jpg"),
    new Recipe("Testy Recipe Street Food","The Simple Testing","https://media.istockphoto.com/id/1414285963/photo/stuffed-turkey-for-thanksgiving-holidays-with-pumpkin-peas-pecan-berry-pie-cheese-variations.jpg?s=2048x2048&w=is&k=20&c=nklu3Vl_PleqV4s4auXxoSzc_jC9NOjbh-9EQh5h4NM=")
  ];

}
