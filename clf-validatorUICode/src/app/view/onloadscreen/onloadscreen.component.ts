import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { UploadFunctionService } from 'src/app/upload-function.service';
import { MatDialog, MatDialogConfig } from '@angular/material/dialog';
import { MessageDisplayComponent } from '../message-display/message-display.component';
import { Router } from '@angular/router';
import { ErrorMessageComponent } from 'src/app/dialogues/error-message/error-message.component';
import { SuccessMessageComponent } from 'src/app/dialogues/success-message/success-message.component';
import { saveAs } from 'file-saver'


@Component({
  selector: 'app-onloadscreen',
  templateUrl: './onloadscreen.component.html',
  styleUrls: ['./onloadscreen.component.css'],
  providers: [
    UploadFunctionService
  ]
})
export class OnloadscreenComponent implements OnInit {
  jsonPreview: string;
  displayErrorMessage: string;
  displaySuccessMessage: string;
  showScroll: boolean;
  disableButton: boolean = true;
  errorResponse: boolean;
  displaySyntaxError:boolean;
  displaySyntaxMessage:any[]; 
  filename: string;
  errorData: any[];
  editContent:boolean;
  disableEdit:boolean;
  fileData:any;
  constructor(private uploadservice: UploadFunctionService, private matDialog: MatDialog,private router:Router) { }
  @ViewChild('fileInput') fileInput: any;
  ngOnInit(): void {
  }



  uploadFile(event) {
   
    this.jsonPreview = "";
    this.showScroll = false;
    this.disableButton = false;
    let files = event.target.files;
    this.filename = files[0].name
   document.getElementById("noFile").innerText = this.filename;
    var ext = this.filename.substring(this.filename.lastIndexOf('.') + 1);
    if ((ext.toLowerCase() == 'json') || (files[0].type == "application/json")) {

      const reader = new FileReader();
      reader.onloadend = (e) => {
        //on success of the reading we need to display the result in the preview section//

        const jsonData = reader.result.toString();
        var isValid = this.isJsonValid(jsonData);
        if (isValid) {
          this.showScroll = true;
          this.disableEdit=true;
          this.jsonPreview = jsonData;

        }
      };
      reader.readAsText(event.target.files[0]);
    }
    else {
      this.jsonPreview = "";
      this.showScroll = false;
      this.displayErrorMessage = "Invalid File type. Please Upload .json file"
      this.matDialog.open(ErrorMessageComponent, { disableClose: true ,data: { confirmationMessage: this.displayErrorMessage } });

      this.disableButton = true;

    }

  }

  isJsonValid(str) {
    try {
      var json = JSON.parse(str);
      return (typeof json === 'object');
    } catch (e) {
      this.showScroll = true;
      this.jsonPreview=str;
      this.displaySyntaxMessage = e;
      this.matDialog.open(ErrorMessageComponent, { disableClose: true ,data: { confirmationMessage: this.displaySyntaxMessage } });
      this.disableButton = true;
      return false;

    }
  }

  clearScreen() {
    this.jsonPreview = "";
   document.getElementById("noFile").innerText = "no file chosen"
    this.disableButton = true;
    this.showScroll = false;
    this.filename=" "
    this.fileInput.nativeElement.value = '';
    this.disableEdit=false;
    this.editContent=false
  }

  fileUpload() {
    this.disableButton = true;

    var data = JSON.parse(this.jsonPreview)
    this.uploadservice.fileUpload(data).subscribe((res: any) => {
      if (res.length == 0) {
        this.displaySuccessMessage = "Script is validated successfully"
        this.matDialog.open(SuccessMessageComponent, { disableClose: true ,data: { confirmationMessage: this.displaySuccessMessage } });
       this.disableEdit=false;
        this.jsonPreview = "";
        this.fileInput.nativeElement.value = '';
        this.filename=" "
        document.getElementById("noFile").innerText = "no file chosen"

      }
      else {
        this.displaySuccessMessage = ""
        this.disableButton=false;
        //const dialogConfig = new MatDialogConfig();
        var uploadError = res;
        this.matDialog.open(MessageDisplayComponent, { disableClose: true ,data: { confirmationMessage: uploadError } });


      }


    }, (_err: any) => {


    })
  }


  gotoView()
  {
    this.router.navigate([`viewAll`]);
  }

  editJsonContent()
  {
    this.editContent=true;
    document.getElementsByTagName("textarea")[0].readOnly = false;
   
  }


  saveAsProject(fileData){
    this.editContent=false;
    //you can enter your own file name and extension
    this.writeContents(fileData, this.filename, 'application/json');
  }
  writeContents(content, fileName, contentType) {
    var a = document.createElement('a');
    var file = new Blob([content], {type: contentType});
    saveAs(file,fileName)

    // a.href = URL.createObjectURL(file);
    // a.download = fileName;
    // a.click();
  }
}

