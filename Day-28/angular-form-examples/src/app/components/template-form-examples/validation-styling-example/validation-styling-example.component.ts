import { Component, OnInit } from '@angular/core';
import {Hero} from '../../../models/hero';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-validation-styling-example',
  templateUrl: './validation-styling-example.component.html',
  styleUrls: ['./validation-styling-example.component.css']
})
export class ValidationStylingExampleComponent implements OnInit {

  powers = ['Really Smart', 'Super Flexible',
    'Super Hot', 'Weather Changer'];

  model = new Hero(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');

  submitted = false;

  onSubmit(form: NgForm): void { this.submitted = true; console.log(form.value); }

  newHero(): void {
    this.model = new Hero(42, '', '');
  }

  ngOnInit(): void {
  }
}
