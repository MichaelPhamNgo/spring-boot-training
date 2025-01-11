import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NumbersNonObservableService {
  num = 0;

  getNumber = () =>
    this.num

  increment = () => {
    this.num++;
    return this.num;
  }

  decrement = () => {
    this.num--;
    return this.num;
  }
}
