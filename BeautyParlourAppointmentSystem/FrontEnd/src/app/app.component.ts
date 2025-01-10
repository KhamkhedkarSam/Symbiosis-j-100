import { Component } from '@angular/core';
import { RouterOutlet,Router } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms'; 
import { FeedbackFormComponent } from './feedback-form/feedback-form.component';
import { FrontpageComponent } from './frontpage/frontpage.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,ReactiveFormsModule,FeedbackFormComponent,FrontpageComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'BeautyParlor'; 
  constructor(){}
}

