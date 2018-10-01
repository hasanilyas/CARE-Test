import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'

@Injectable()
export class ComponentsService {

  constructor(private http:HttpClient) {
  }
 
  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/components');
  }

  deleteComponent(component: string){  
    return this.http.delete('//localhost:8080/components/delete/' + component);
  }

  addComponent(formdata : any): Observable<any>{
    let result: Observable<Object>
    result=this.http.post('//localHost:8080/components/add', formdata);
    return result
  } 
}
