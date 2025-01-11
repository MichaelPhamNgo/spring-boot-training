import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ChildEmptyComponent} from './child-empty/child-empty.component';
import {ChildNestedComponent} from './child-nested/child-nested.component';
import {ChildComponent} from './child.component';
import {WildCardComponent} from '../../components/wild-card/wild-card.component';


const routes: Routes = [
  // 7. change '' to 'child'
  // 8. put the wildcard in this routes array
  {path: '', component: ChildComponent,
  // {path: 'child', component: ChildComponent,
    children: [
      {
        path: 'nested',
        component: ChildNestedComponent
      }
    ]
  },
  // {path: '**', component: WildCardComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChildRoutingModule { }
