import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParentComponent } from './components/communication/parent/parent.component';
import {FormsModule} from '@angular/forms';
import { ChildInputComponent } from './components/communication/child-input/child-input.component';
import { ChildOutputComponent } from './components/communication/child-output/child-output.component';
import { LocalVariableComponent } from './components/communication/local-variable/local-variable.component';
import { ViewChildComponent } from './components/communication/view-child/view-child.component';
import { LifeCycleComponent } from './components/life-cycle/life-cycle/life-cycle.component';
import { TopNonObservableComponent } from './components/service-examples/non-observable/top-non-observable/top-non-observable.component';
import { BottomNonObservableComponent } from './components/service-examples/non-observable/bottom-non-observable/bottom-non-observable.component';
import { BottomObservableComponent } from './components/service-examples/observable/bottom-observable/bottom-observable.component';
import { TopObservableComponent } from './components/service-examples/observable/top-observable/top-observable.component';
import { HttpComponent } from './components/service-examples/http/http/http.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    ChildInputComponent,
    ChildOutputComponent,
    LocalVariableComponent,
    ViewChildComponent,
    LifeCycleComponent,
    TopNonObservableComponent,
    BottomNonObservableComponent,
    BottomObservableComponent,
    TopObservableComponent,
    HttpComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
