import { Routes } from '@angular/router';
import { FeedbackFormComponent } from './feedback-form/feedback-form.component';
import { FrontpageComponent } from './frontpage/frontpage.component';
// import { CourseBookingComponent } from './course-booking/course-booking.component';
// import { CourseComponent } from './course/course.component';

export const routes: Routes = [
    { path: '',component: FrontpageComponent},
    { path: 'Feedback', component: FeedbackFormComponent },  
    
 ];