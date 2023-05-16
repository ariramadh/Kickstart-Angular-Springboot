import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app-angular';
  constructor(private http: HttpClient) {}

  value: any = "";
  value2: any;
  res: any;

  ngOnInit(): void {
    this.http.get('http://localhost:8080/api/list').subscribe(val => {
      this.res = val
      
      for (const object of this.res) {
        console.log(object.name)
        // this.value = object.name;
      }
    })
  }
}
