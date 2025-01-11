import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SampleOneComponent } from './components/sample-one/sample-one.component';
import { SampleTwoComponent } from './components/sample-two/sample-two.component';
import { HighlightDirective } from './directives/highlight.directive';
import { SampleThreeComponent } from './components/sample-three/sample-three.component';
import { LogDirective } from './directives/log.directive';

@NgModule({
  declarations: [
    AppComponent,
    HighlightDirective,
    SampleOneComponent,
    SampleThreeComponent,
    SampleTwoComponent,
    LogDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [
    SampleOneComponent
  ]
})
export class AppModule { }
