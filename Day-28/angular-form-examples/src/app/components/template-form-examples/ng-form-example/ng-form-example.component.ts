import { Component, OnInit } from '@angular/core';
import {Hero} from '../../../models/hero';

@Component({
  selector: 'app-ng-form-example',
  templateUrl: './ng-form-example.component.html',
  styleUrls: ['./ng-form-example.component.css']
})
export class NgFormExampleComponent implements OnInit {

  powers = ['Really Smart', 'Super Flexible',
    'Super Hot', 'Weather Changer'];

  model = new Hero(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');

  submitted = false;

  ngOnInit(): void {
  }

  onSubmit(): void { this.submitted = true; }
}
