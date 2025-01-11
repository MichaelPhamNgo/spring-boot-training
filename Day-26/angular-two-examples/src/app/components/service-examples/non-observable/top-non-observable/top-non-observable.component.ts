import { Component, OnInit } from '@angular/core';
import {NumbersNonObservableService} from '../../../../services/numbers-non-observable/numbers-non-observable.service';

@Component({
  selector: 'app-top-non-observable',
  templateUrl: './top-non-observable.component.html',
  styleUrls: ['./top-non-observable.component.css']
})
export class TopNonObservableComponent implements OnInit {
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
