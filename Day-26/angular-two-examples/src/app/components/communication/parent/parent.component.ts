import {Component, OnInit, ViewChild} from '@angular/core';
import {ViewChildComponent} from '../view-child/view-child.component';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  list = ['jack', 'kyle'];
  @ViewChild(ViewChildComponent)
  childComponent: ViewChildComponent;

  constructor() { }

  ngOnInit(): void {
  }

  add = (item) => {
    this.list.push(item);
  }

  callChildIncrementMethod = () => {
    this.childComponent.increment();
  }

  callChildDecrementMethod = () => {
    this.childComponent.decrement();
  }
}
