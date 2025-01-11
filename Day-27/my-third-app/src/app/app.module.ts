import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import {HeroInfoService} from './services/hero-info.service';

import {ChildModule} from './modules/child/child.module';

import {ChildRoutingModule} from './modules/child/child-routing.module';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Sample1Component } from './components/sample1/sample1.component';
import { WildCardComponent } from './components/wild-card/wild-card.component';
import { EmptyComponent } from './components/empty/empty.component';
import { NestedComponent } from './components/nested/nested.component';
import { NestedAComponent } from './components/nested/nested-a/nested-a.component';
import { NestedBComponent } from './components/nested/nested-b/nested-b.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HeroDetailComponent } from './components/heroes/hero-detail/hero-detail.component';
import { QueryParameterComponent } from './components/query-parameter/query-parameter.component';
import { AuthErrorComponent } from './components/auth-error/auth-error.component';
import { AdminPageComponent } from './components/admin-page/admin-page.component';
import { UserPageComponent } from './components/user-page/user-page.component';
import { PlaceHolderComponent } from './components/place-holder/place-holder.component';
import { MyPipePipe } from './pipe/my-pipe.pipe';
import { SamplePipePipe } from './pipe/sample-pipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    Sample1Component,
    WildCardComponent,
    EmptyComponent,
    NestedComponent,
    NestedAComponent,
    NestedBComponent,
    HeroesComponent,
    HeroDetailComponent,
    QueryParameterComponent,
    AuthErrorComponent,
    AdminPageComponent,
    UserPageComponent,
    PlaceHolderComponent,
    MyPipePipe,
    SamplePipePipe
  ],
  // 5. import the ChildModule
  // 6. go to child-routing.module.ts
  imports: [
    BrowserModule,
    AppRoutingModule,
   
    FormsModule,
    // ChildModule,
  ],
  providers: [HeroInfoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
