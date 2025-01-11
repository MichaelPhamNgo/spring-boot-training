import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-form-group-example',
  templateUrl: './form-group-example.component.html',
  styleUrls: ['./form-group-example.component.css']
})
export class FormGroupExampleComponent implements OnInit {
  profileForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
  });
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(): void {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
  }
}
