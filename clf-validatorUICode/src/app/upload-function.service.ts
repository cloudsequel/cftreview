import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams, HttpResponse, } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class UploadFunctionService {

  constructor(private http: HttpClient) { }


  fileUpload(te): Observable<any> {
    let httpBody = new HttpParams();
    var data = { }
    let httpHeaders = new HttpHeaders({
      'Content-Type': 'application/json',
      'Cache-Control': 'no-cache,no-store',
      'Pragma': 'no-cache'
    });
    let options = {
      headers: httpHeaders
    };
    return this.http.post<any>('http://10.192.225.57:9091/getFragment', data, options)
    // .pipe((response: Response) =>{
    //   console.log (response.json());
    //   });
    //APIEndpoint+'/fragmentservice/getFragment
  }
}
