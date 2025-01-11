import { Injectable } from '@angular/core';
import {Hero, HEROES} from '../domain/hero';

@Injectable({
  providedIn: 'root'
})
export class HeroInfoService {

  public heroes: Hero[] = HEROES;
  constructor() { }

  getHeroes(): Hero[] {
    return this.heroes;
  }
}
