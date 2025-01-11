import { Component, OnInit } from '@angular/core';
import {Hero} from '../../domain/hero';
import {HeroInfoService} from '../../services/hero-info.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  public heroes: Hero[];
  constructor(public heroInfoService: HeroInfoService) { }

  ngOnInit() {
    this.heroes = this.heroInfoService.getHeroes();
  }

}
