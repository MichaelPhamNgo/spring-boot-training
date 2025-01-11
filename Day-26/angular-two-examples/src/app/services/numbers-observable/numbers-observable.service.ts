import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NumbersObservableService {
  currentNumber: BehaviorSubject<number> = new BehaviorSubject<number>(0);
  constructor() { }

  getNumber = () =>
    this.currentNumber

  increment = () => {
    this.currentNumber.next(this.currentNumber.getValue() + 1);
  }

  decrement = () => {
    this.currentNumber.next(this.currentNumber.getValue() - 1);
  }
}
