import { Component, OnInit } from '@angular/core';
import {NumbersObservableService} from '../../../../services/numbers-observable/numbers-observable.service';

@Component({
  selector: 'app-top-observable',
  templateUrl: './top-observable.component.html',
  styleUrls: ['./top-observable.component.css']
})
export class TopObservableComponent implements OnInit {
  num: number;

  constructor(private numbersService: NumbersObservableService) { }

  ngOnInit(): void {
    this.numbersService.getNumber().subscribe((num) => {
      this.num = num;
    });
  }

  increment = () => {
    this.numbersService.increment();
  }

  decrement = () => {
    this.numbersService.decrement();
  }
}
