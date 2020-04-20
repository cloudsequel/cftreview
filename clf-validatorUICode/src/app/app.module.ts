import {BrowserModule} from '@angular/platform-browser';
import {NgModule, CUSTOM_ELEMENTS_SCHEMA, ApplicationModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FlexLayoutModule} from '@angular/flex-layout';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HeaderComponent} from './view/header/header.component';
import {OnloadscreenComponent} from './view/onloadscreen/onloadscreen.component';
import {FormsModule} from '@angular/forms';
import {UploadFunctionService} from './upload-function.service';
import {HttpClientModule} from '@angular/common/http';
import {MessageDisplayComponent} from './view/message-display/message-display.component';
import {MatDialogModule} from '@angular/material/dialog';
import {TableViewComponent} from './view/table-view/table-view.component';
import {MatTableModule} from '@angular/material/table';
import {MatTooltipModule} from '@angular/material/tooltip';
import {ErrorMessageComponent} from './dialogues/error-message/error-message.component';
import {SuccessMessageComponent} from './dialogues/success-message/success-message.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    OnloadscreenComponent,
    MessageDisplayComponent,
    TableViewComponent,
    ErrorMessageComponent,
    SuccessMessageComponent,

  ],
  imports: [
    BrowserModule,
    ApplicationModule,
    AppRoutingModule,
    FlexLayoutModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    MatDialogModule,
    MatTableModule,
    MatTooltipModule

  ],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  bootstrap: [AppComponent],
  entryComponents: [MessageDisplayComponent, ErrorMessageComponent, SuccessMessageComponent]
})
export class AppModule {
}
