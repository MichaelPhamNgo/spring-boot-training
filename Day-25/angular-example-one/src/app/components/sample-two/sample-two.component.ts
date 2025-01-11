import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sample-two',
  templateUrl: './sample-two.component.html',
  styleUrls: ['./sample-two.component.css']
})
export class SampleTwoComponent implements OnInit {

  showColor = true;
  currentStyle = {
    'width': '200px',
    'height': '200px',
    'border': '1px dashed black'
  }

  showName = true;
  names = ["Kyle","Jack"];
  myName = "Jack";

  constructor() { }

  ngOnInit(): void {
  }

  changeClass() {
    this.showColor = !this.showColor;
  }

  changeShowName() {
    this.showName = !this.showName;
  }

}
