import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';

import { ChildRoutingModule } from './child-routing.module';
import { ChildComponent } from './child.component';
import { ChildNestedComponent } from './child-nested/child-nested.component';
import { ChildEmptyComponent } from './child-empty/child-empty.component';


@NgModule({
  declarations: [ChildComponent, ChildNestedComponent, ChildEmptyComponent],
  imports: [
    CommonModule,
    ChildRoutingModule,
    RouterModule
  ]
})
export class ChildModule { }
