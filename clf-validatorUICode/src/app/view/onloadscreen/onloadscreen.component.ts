import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { UploadFunctionService } from 'src/app/upload-function.service';

@Component({
  selector: 'app-onloadscreen',
  templateUrl: './onloadscreen.component.html',
  styleUrls: ['./onloadscreen.component.css'],
  providers: [
    UploadFunctionService
]
})
export class OnloadscreenComponent implements OnInit {
  jsonPreview:string;
  displayError:boolean;
  displayErrorMessage:string;
  displaySucces:boolean;
  displaySuccessMessage:string;
  jsonValueExist:boolean;
  disableButton:boolean;
  constructor( private uploadservice:UploadFunctionService) { }

  ngOnInit(): void {
  }

 

  closeAlert() {
    //this.alert.nativeElement.classList.remove('show');
    this.displayError=false;
    this.displayErrorMessage=""
    document.getElementById("noFile").innerText="no file chosen"
  }

  uploadFile(event) {
    this.jsonPreview="";
    this.jsonValueExist=false;
    this.displayError=false;
    this.displayErrorMessage=""
    this.disableButton=false;
    let files = event.target.files;
    let name=files[0].name
    document.getElementById("noFile").innerText=name;
      var ext = name.substring(name.lastIndexOf('.') + 1);
      if((ext.toLowerCase() == 'json') || (files[0].type=="application/json")){
        const reader = new FileReader();
        reader.onloadend = (e) => {
        //on success of the reading we need to display the result in the preview section//
        this.jsonValueExist=true;
        this.jsonPreview=reader.result.toString();
      };
      reader.readAsText(event.target.files[0]);
}
    else {
      this.jsonPreview="";
      this.jsonValueExist=false;
      this.displayError=true;
      this.displayErrorMessage="Invalid File type. Please Upload .json file"
    }
    
    }



    clearScreen()
    {
      this.jsonPreview="";
      document.getElementById("noFile").innerText="no file chosen"
      this.displayError=false;
      this.displayErrorMessage=""
      this.disableButton=false;
    }

    fileUpload()
    {
      this.disableButton=true;
     
      var data= JSON.parse(this.jsonPreview)
this.uploadservice.fileUpload(data).subscribe((res: any) =>
  {
    this.disableButton=false;

  },(_err: any)=>
  {

  })
    }
  }

