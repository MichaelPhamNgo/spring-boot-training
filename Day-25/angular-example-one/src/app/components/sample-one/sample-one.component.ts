import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sample-one',
  templateUrl: './sample-one.component.html',
  styleUrls: ['./sample-one.component.css']
})
export class SampleOneComponent implements OnInit {

  title = 'angular-example-one';
  style = "height:100px;width:100px;background:red;"
  name = "Landon";

  constructor() { }

  ngOnInit(): void {
    
  }

  bindMethod() {
    return "Bind with method";
  }

  showTitle() {
    alert(this.title);
  }

  showName() {
    alert(this.name);
  }

}
