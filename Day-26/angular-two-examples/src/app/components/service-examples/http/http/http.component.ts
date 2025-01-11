import { Component, OnInit } from '@angular/core';
import {HttpService} from '../../../../services/http/http.service';
import {User} from '../../../../models/user.model';

@Component({
  selector: 'app-http',
  templateUrl: './http.component.html',
  styleUrls: ['./http.component.css']
})
export class HttpComponent implements OnInit {
  users: User[];
  username: string;
  password: string;

  constructor(private httpService: HttpService) {
    this.users = [];
  }

  ngOnInit(): void {
    this.httpService.getUsers().subscribe((users: User[]) => {
      this.users = users;
    });
  }

  addUser(): void {
    this.httpService.addUser(new User(this.username, this.password)).subscribe((response: string) => {
      console.log(response);
      this.httpService.getUsers().subscribe((users: User[]) => {
        this.users = users;
      });
    });
  }
}
