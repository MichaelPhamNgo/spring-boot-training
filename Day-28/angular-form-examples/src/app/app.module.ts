import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgModelExampleComponent } from './components/template-form-examples/ng-model-example/ng-model-example.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NgFormExampleComponent } from './components/template-form-examples/ng-form-example/ng-form-example.component';
import { NgModelGroupExampleComponent } from './components/template-form-examples/ng-model-group-example/ng-model-group-example.component';
import { ValidationStylingExampleComponent } from './components/template-form-examples/validation-styling-example/validation-styling-example.component';
import { FormControlExampleComponent } from './components/reactive-form-examples/form-control-example/form-control-example.component';
import { FormGroupExampleComponent } from './components/reactive-form-examples/form-group-example/form-group-example.component';
import { NestedFormGroupExampleComponent } from './components/reactive-form-examples/nested-form-group-example/nested-form-group-example.component';
import { FormBuilderExampleComponent } from './components/reactive-form-examples/form-builder-example/form-builder-example.component';
import { ReactiveFormValidationExampleComponent } from './components/reactive-form-examples/reactive-form-validation-example/reactive-form-validation-example.component';
import { FormArrayExampleComponent } from './components/reactive-form-examples/form-array-example/form-array-example.component';

@NgModule({
  declarations: [
    AppComponent,
    NgModelExampleComponent,
    NgFormExampleComponent,
    NgModelGroupExampleComponent,
    ValidationStylingExampleComponent,
    FormControlExampleComponent,
    FormGroupExampleComponent,
    NestedFormGroupExampleComponent,
    FormBuilderExampleComponent,
    ReactiveFormValidationExampleComponent,
    FormArrayExampleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
