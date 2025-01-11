import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private http: HttpClient) { }

  getUsers = () =>
    this.http.get('http://localhost:8080/api/user')

  addUser = (user) =>
    this.http.post('http://localhost:8080/api/user', user, {
      responseType: 'text'
    })
}
