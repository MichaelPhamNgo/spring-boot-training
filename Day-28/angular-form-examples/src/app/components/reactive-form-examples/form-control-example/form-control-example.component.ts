import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-form-control-example',
  templateUrl: './form-control-example.component.html',
  styleUrls: ['./form-control-example.component.css']
})
export class FormControlExampleComponent implements OnInit {
  name = new FormControl('');
  constructor() { }

  ngOnInit(): void {
  }

  updateName(): void {
    this.name.setValue('Nancy');
  }

}
