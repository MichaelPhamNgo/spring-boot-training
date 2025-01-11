import { Component, OnInit } from '@angular/core';
import {FormArray, FormBuilder, Validators} from '@angular/forms';

@Component({
  selector: 'app-form-array-example',
  templateUrl: './form-array-example.component.html',
  styleUrls: ['./form-array-example.component.css']
})
export class FormArrayExampleComponent implements OnInit {

  profileForm = this.fb.group({
    firstName: ['', Validators.required],
    lastName: [''],
    address: this.fb.group({
      street: [''],
      city: [''],
      state: [''],
      zip: ['']
    }),
    aliases: this.fb.array([
      this.fb.control('')
    ])
  });

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
  }

  onSubmit(): void {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
  }

  updateProfile(): void {
    this.profileForm.patchValue({
      firstName: 'Nancy',
      address: {
        street: '123 Drew Street'
      }
    });
  }

  get aliases(): FormArray {
    return this.profileForm.get('aliases') as FormArray;
  }

  // tslint:disable-next-line:max-line-length
  // if the angular getter syntax is confusing then you use this way instead. In that case in the html template uncomment line 34 and comment line 35
  getAliases(): FormArray {
    return this.profileForm.get('aliases') as FormArray;
  }

  addAlias(): void {
    this.aliases.push(this.fb.control(''));
  }
}
