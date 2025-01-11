import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-third-app';

  public inputName = '';

  constructor(private router: Router) {}

  toSample1(): void {
    this.router.navigate(['sample1']);
  }

  toNested(): void {
    this.router.navigate(['nested']);
  }

  inputNameMethod(): void {
    this.router.navigate(['qp'], {
      queryParams: {
        name: this.inputName,
      }
    });
    this.inputName = '';
  }

  loginAsAdmin(): void {
    sessionStorage.setItem('login', 'true');
    sessionStorage.setItem('role', 'admin');
  }
  loginAsUser(): void {
    sessionStorage.setItem('login', 'true');
    sessionStorage.setItem('role', 'user');
  }
  logout(): void {
    sessionStorage.clear();
  }
}
