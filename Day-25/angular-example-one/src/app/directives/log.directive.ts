import { Directive } from '@angular/core';

@Directive({
  selector: '[appLog]',
  host:{
    '(input)': 'onInput($event)'
  }
})
export class LogDirective {


  constructor() { }

  onInput(event: { target: { value: any; }; }){
    console.log(event.target.value)
  }

}
