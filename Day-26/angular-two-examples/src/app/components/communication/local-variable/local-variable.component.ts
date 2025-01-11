import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-local-variable',
  templateUrl: './local-variable.component.html',
  styleUrls: ['./local-variable.component.css']
})
export class LocalVariableComponent implements OnInit {
  count = 0;

  constructor() { }

  ngOnInit(): void {
  }

  increment = () => {
    this.count++;
  }

  decrement = () => {
    this.count--;
  }
}
