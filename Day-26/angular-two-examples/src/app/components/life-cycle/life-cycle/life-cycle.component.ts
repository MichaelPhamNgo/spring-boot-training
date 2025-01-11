import {
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  Component, DoCheck,
  OnChanges,
  OnDestroy,
  OnInit,
  SimpleChanges
} from '@angular/core';
// tslint:disable-next-line:no-conflicting-lifecycle
@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
// tslint:disable-next-line:max-line-length
export class LifeCycleComponent implements OnInit, OnDestroy, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked {

  constructor() { }

  ngOnInit(): void {
    console.log('ngOnInit');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngOnChanges');
    console.log(changes);
  }

  ngDoCheck(): void {
    console.log('ngDoCheck');
  }

  ngAfterContentChecked(): void {
    console.log('ngAfterContentChecked');
  }


  ngAfterContentInit(): void {
    console.log('ngAfterContentInit');
  }


  ngAfterViewChecked(): void {
    console.log('ngAfterViewChecked');
  }

  ngAfterViewInit(): void {
    console.log('ngAfterViewInit');
  }



  ngOnDestroy(): void {
    console.log('ngOnDestroy');
  }
}
