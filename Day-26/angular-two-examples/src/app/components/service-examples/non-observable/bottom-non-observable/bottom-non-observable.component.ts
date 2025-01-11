import { Component, OnInit } from '@angular/core';
import {NumbersNonObservableService} from '../../../../services/numbers-non-observable/numbers-non-observable.service';

@Component({
  selector: 'app-bottom-non-observable',
  templateUrl: './bottom-non-observable.component.html',
  styleUrls: ['./bottom-non-observable.component.css']
})
export class BottomNonObservableComponent implements OnInit {
  num: number;

  constructor(private numbersService: NumbersNonObservableService) { }

  ngOnInit(): void {
    this.num = this.numbersService.getNumber();
  }

  increment = () => {
    this.num = this.numbersService.increment();
  }

  decrement = () => {
    this.num = this.numbersService.decrement();
  }

  refresh = () => {
    this.num = this.numbersService.getNumber();
  }
}
