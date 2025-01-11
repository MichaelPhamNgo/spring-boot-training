import { Hero, HEROES } from './../domain/Hero';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.css']
})
export class FirstComponentComponent implements OnInit {

 
  name:string = 'Rachel';
  redText:string = 'red';
  isHide:boolean = false;
  counter:number = 0;

  inputValue:number = 1;
  heroes = HEROES;
  selectedHero:Hero;

  constructor() { }

  ngOnInit() {
  }

  getName():string {
    return this.name;
  }

  onIncreaseClick(user:string):void {
    this.counter++;
    console.log('Increase Button Clicked by ' + user);
  }

  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }

  calculateClasses() {
    return {
      'selector-color': true,
      'selector-font': true
    };
  }
}
