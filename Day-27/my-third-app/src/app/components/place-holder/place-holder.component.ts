import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-place-holder',
  templateUrl: './place-holder.component.html',
  styleUrls: ['./place-holder.component.css']
})
export class PlaceHolderComponent implements OnInit {

  today = '2020/1/1';
  name = 'Jason';
  number = 12.123123;
  constructor() { }

  ngOnInit() {
  }

}
