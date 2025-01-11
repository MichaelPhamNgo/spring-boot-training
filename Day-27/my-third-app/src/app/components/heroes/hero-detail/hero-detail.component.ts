import { Component, OnInit } from '@angular/core';
import {Hero} from '../../../domain/hero';
import {HeroInfoService} from '../../../services/hero-info.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css']
})
export class HeroDetailComponent implements OnInit {

  public heroes: Hero[];
  public index: number;
  constructor(public heroInfoService: HeroInfoService, public route: ActivatedRoute) { }

  ngOnInit() {
    this.heroes = this.heroInfoService.getHeroes();
    this.route.params.subscribe(
      params => {
        this.index = params.id;
      }
    );
  }
}
