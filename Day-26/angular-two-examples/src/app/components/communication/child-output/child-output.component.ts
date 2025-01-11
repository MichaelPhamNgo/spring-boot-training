import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-child-output',
  templateUrl: './child-output.component.html',
  styleUrls: ['./child-output.component.css']
})
export class ChildOutputComponent implements OnInit {
  inputValue: string;
  @Output()
  addItemToParentArray = new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
  }

  addItem = () => {
    this.addItemToParentArray.emit(this.inputValue);
  }
}
