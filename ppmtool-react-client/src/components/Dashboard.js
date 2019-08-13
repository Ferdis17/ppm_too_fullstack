import React, {Component} from "react";
import ProjectItem from "./Project/ProjectItem";
import CreateProjectButton from "./Project/CreateProjectButton";

class Dashboard extends Component {
    render() {
        return (
            < div >
            {
                // <!-- Dashboard Component (Project Item included) -->
            }

            < div
        className = "projects" >
            < div
        className = "container" >
            < div
        className = "row" >
            < div
        className = "col-md-12" >
            < h1
        className = "display-4 text-center" > Projects < /h1>
            < br / >
            < CreateProjectButton / >
            < br / >
            < hr / >
            < ProjectItem / >

            {
                //<!-- Project Item Component -->
            }

        {
            //<!-- End of Project Item Component -->
        }

    <
        /div>
        < /div>
        < /div>
        < /div>

        {
            //<!-- End of Dashboard Component -->
        }


    <
        /div>
    )
        ;
    }
}

export default Dashboard;
