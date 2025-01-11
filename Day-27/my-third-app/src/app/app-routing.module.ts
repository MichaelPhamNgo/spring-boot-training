import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {AppComponent} from './app.component';
import {Sample1Component} from './components/sample1/sample1.component';
import {WildCardComponent} from './components/wild-card/wild-card.component';
import {EmptyComponent} from './components/empty/empty.component';
import {NestedAComponent} from './components/nested/nested-a/nested-a.component';
import {NestedBComponent} from './components/nested/nested-b/nested-b.component';
import {NestedComponent} from './components/nested/nested.component';
import {QueryParameterComponent} from './components/query-parameter/query-parameter.component';
import {HeroesComponent} from './components/heroes/heroes.component';
import {HeroDetailComponent} from './components/heroes/hero-detail/hero-detail.component';
import {AuthErrorComponent} from './components/auth-error/auth-error.component';
import {AdminPageComponent} from './components/admin-page/admin-page.component';
import {LoginGuard} from './guards/login.guard';
import {AdminGuard} from './guards/admin.guard';
import {UserGuard} from './guards/user.guard';
import {UserPageComponent} from './components/user-page/user-page.component';
import {PlaceHolderComponent} from './components/place-holder/place-holder.component';


const routes: Routes = [
  //localhost:4200
  {path: '', component: EmptyComponent},
  //localhost:4200/sample1
  {path: 'sample1', component: Sample1Component},
  { path: 'sample1', component: Sample1Component, outlet: 'headline' },
  {path: 'test', redirectTo: 'sample1'},
  { path: 'nested', component: NestedComponent,
    children: [
      {
        path: 'nest-a',
        component: NestedAComponent,
      },
      {
        path: 'nest-b',
        component: NestedBComponent
      }
    ]
  },
  {path: 'heroes', component: HeroesComponent,
    children: [
      {path: 'hero/:id', component: HeroDetailComponent}
    ]
  },
  {path: 'qp', component: QueryParameterComponent},
  {path: 'guardError', component: AuthErrorComponent},
  {path: 'admin', component: AdminPageComponent, canActivate: [LoginGuard, AdminGuard]},
  {path: 'user', component: UserPageComponent, canActivate: [LoginGuard, UserGuard]},
  // instruction to change to eager load
  // 1. comment following object
  // 2. use redirectTo: 'child'
  // 3. comment the wildcard '**'
  // 4. go to the app.module.ts
  {
    path: 'childModule',
    loadChildren: () => import('./modules/child/child.module').then(m => m.ChildModule),
  },
  // {
  //   path: 'childModule',
  //   redirectTo: 'child',
  //   pathMatch: 'full'
  // },
  {path: 'placeholder', component: PlaceHolderComponent},
  {path: '**', component: WildCardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
