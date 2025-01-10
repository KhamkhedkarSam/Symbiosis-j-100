import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-frontpage',
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './frontpage.component.html',
  styleUrl: './frontpage.component.css'
})
export class FrontpageComponent {
  isLoginClicked: boolean = false;
  isAdmin: boolean = false;
  isUser: boolean = false;

  constructor() { }
  
  showLoginOptions(): void {
    this.isLoginClicked = !this.isLoginClicked; 
  }
  showRegister(): void {
    console.log("Register clicked");
  }

}


