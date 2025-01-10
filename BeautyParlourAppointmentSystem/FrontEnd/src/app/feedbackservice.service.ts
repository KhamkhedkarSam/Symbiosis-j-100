import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FeedbackserviceService {
apiUrl:string = 'http://localhost:3000/feedback';
http:any
  constructor(private httpClient:HttpClient) { }
  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  
  createFeedback(feedback:any){
    return this.httpClient.post(`${this.apiUrl} /CreateFeedback`, feedback,this.httpOptions)
  }
}
