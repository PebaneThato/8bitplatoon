<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>8 Bit Platoon - Email Communication</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Font CSS (Via CDN) -->
        <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700'>

        <!-- Theme CSS -->
        <link rel="stylesheet" type="text/css" href="assets/skin/default_skin/css/theme.css">

        <!-- Admin Forms CSS -->
        <link rel="stylesheet" type="text/css" href="assets/admin-tools/admin-forms/css/admin-forms.css">

    </head>

    <body class="admin-validation-page" data-spy="scroll" data-target="#nav-spy" data-offset="200">

        <!-- Start: Main -->
        <div id="main">

            <!-- Start: Header -->
            <header class="navbar navbar-fixed-top navbar-shadow">
                <div class="navbar-branding">
                    <a class="navbar-brand" href="javascript:void(0)">
                        <b>8</b> Bit Platoon
                    </a>
                    <span id="toggle_sidemenu_l" class="ad ad-lines"></span>
                </div>
            </header>
            <!-- End: Header -->

            <!-- Start: Sidebar -->
            <aside id="sidebar_left" class="nano nano-light affix">
                <!-- Start: Sidebar Left Content -->
                <div class="sidebar-left-content nano-content">
                </div>
                <!-- End: Sidebar Left Content -->
            </aside>
            <!-- End: Sidebar -->

            <!-- Start: Content-Wrapper -->
            <section id="content_wrapper">

                <!-- Begin: Content -->
                <section id="content" class="table-layout animated fadeIn">

                    <!-- begin: .tray-center -->
                    <div class="tray tray-center">

                        <!-- Begin: Content Header -->
                        <div class="content-header">
                            <h2> Email Communication Registration</h2>
                        </div>

                        <div id ="feedBack">
                            
                        </div>

                        <!-- Validation Example -->
                        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">

                            <div class="panel heading-border panel-primary">

                                <form method="post" id="admin-form">

                                    <div class="panel-body bg-light">

                                        <div class="section-divider mt20 mb40">
                                            <span> Please fill all the fields below </span>
                                        </div>
                                        <!-- .section-divider -->

                                        <div class="section row" id="spy1">
                                            <div class="col-md-6">
                                                <label for="entityName" class="field prepend-icon">
                                                    <input type="text" name="entityName" id="entityName" class="gui-input" placeholder="Entity Name">
                                                    <label for="entityName" class="field-icon">
                                                        <i class="fa fa-th"></i>
                                                    </label>
                                                </label>
                                            </div>

                                            <div class="col-md-6">
                                                <label for="emailAddress" class="field prepend-icon">
                                                    <input type="email" name="emailAddress" id="emailAddress" class="gui-input" placeholder="Email Address">
                                                    <label for="emailAddress" class="field-icon">
                                                        <i class="fa fa-envelope"></i>
                                                    </label>
                                                </label>
                                            </div>
                                        </div>
                                        <!-- end .section row section -->

                                        <div class="section">
                                            <label for="cicType" class="field prepend-icon">
                                                <input type="text" name="cicType" id="cicType" class="gui-input" placeholder="Communication Type">
                                                <label for="cicType" class="field-icon">
                                                    <i class="fa fa-text-width"></i>
                                                </label>
                                            </label>
                                        </div>

                                        <div class="section">
                                            <label for="cicSubject" class="field prepend-icon">
                                                <input type="text" name="cicSubject" id="cicSubject" class="gui-input" placeholder="Communication Subject">
                                                <label for="cicSubject" class="field-icon">
                                                    <i class="fa fa-file-text"></i>
                                                </label>
                                            </label>
                                        </div>

                                        <div class="section">
                                            <label for="cicBody" class="field prepend-icon">
                                                <input type="text" name="cicBody" id="cicBody" class="gui-input" placeholder="Communication Body">
                                                <label for="cicBody" class="field-icon">
                                                    <i class="fa fa-paste"></i>
                                                </label>
                                            </label>
                                        </div>

                                        <div class="section">
                                            <label for="crcSystem" class="field prepend-icon">
                                                <input type="text" name="crcSystem" id="crcSystem" class="gui-input" placeholder="Source System">
                                                <label for="crcSystem" class="field-icon">
                                                    <i class="fa fa-arrow-circle-right"></i>
                                                </label>
                                            </label>
                                        </div>

                                        <div class="section">
                                            <label for="datepicker1" class="field prepend-icon">
                                                <input type="text" id="datepicker1" name="datepicker1" class="gui-input" placeholder="Time Stamp" data-date-format='yy-mm-dd'>
                                                <label class="field-icon">
                                                    <i class="fa fa-calendar-o"></i>
                                                </label>
                                            </label>
                                        </div>
                                        <!-- end section -->

                                    </div>
                                    <!-- end .form-body section -->
                                    <div class="panel-footer text-right">
                                        <button type="submit" id="submit" class="button btn-primary"> Register </button>
                                        <button type="reset" class="button"> Cancel </button>
                                    </div>
                                    <!-- end .form-footer section -->
                                </form>

                            </div>

                        </div>
                        <!-- end: .admin-form -->

                    </div>
                    <!-- end: .tray-center -->

                    <!-- begin: .tray-right -->
                    <aside class="tray tray-right tray290">

                    </aside>
                    <!-- end: .tray-right -->

                </section>
                <!-- End: Content -->

            </section>
            <!-- End: Content-Wrapper -->

            <!-- Start: Right Sidebar -->
            <aside id="sidebar_right" class="nano affix">
                <!-- Start: Sidebar Right Content -->
                <div class="sidebar-right-content nano-content">
                </div>
            </aside>
            <!-- End: Right Sidebar -->

        </div>
        <!-- End: Main -->

        <!-- BEGIN: PAGE SCRIPTS -->

        <style>
            /* demo page styles */
            body { min-height: 2300px; }

            .content-header b,
            .admin-form .panel.heading-border:before,
            .admin-form .panel .heading-border:before {
                transition: all 0.7s ease;
            }
            /* responsive demo styles */
            @media (max-width: 800px) {
                .admin-form .panel-body { padding: 18px 12px; }
            }
        </style>

        <style>
            .ui-datepicker select.ui-datepicker-month,
            .ui-datepicker select.ui-datepicker-year {
                width: 48%;
                margin-top: 0;
                margin-bottom: 0;

                line-height: 25px;
                text-indent: 3px;

                color: #888;
                border-color: #DDD;
                background-color: #FDFDFD;

                -webkit-appearance: none;
            }
        </style>

        <!-- jQuery -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/js/jquery-ui.min.js"></script>

        <!-- jQuery Validate Plugin-->
        <script src="assets/admin-tools/admin-forms/js/jquery.validate.min.js"></script>

        <!-- AdminForms JS -->
        <script src="assets/admin-tools/admin-forms/js/jquery-ui-datepicker.min.js"></script>

        <!-- Theme Javascript -->
        <script src="assets/js/utility/utility.js"></script>
        <script src="assets/js/demo/demo.js"></script>
        <script src="assets/js/main.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {

                "use strict";

                // Init Theme Core    
                Core.init();

                // Init Demo JS     
                Demo.init();

                /* @custom validation method (smartCaptcha) 
                 ------------------------------------------------------------------ */

                $.validator.methods.smartCaptcha = function (value, element, param) {
                    return value == param;
                };

                $("#admin-form").validate({
                    /* @validation states + elements 
                     ------------------------------------------- */

                    errorClass: "state-error",
                    validClass: "state-success",
                    errorElement: "em",
                    /* @validation rules 
                     ------------------------------------------ */

                    rules: {
                        datepicker1: {
                            required: true,
                            date: true
                        },
                        entityName: {
                            required: true
                        },
                        emailAddress: {
                            required: true,
                            email: true
                        },
                        cicType: {
                            required: true
                        },
                        cicSubject: {
                            required: true
                        },
                        cicBody: {
                            required: true
                        },
                        crcSystem: {
                            required: true
                        }
                    },
                    /* @validation error messages 
                     ---------------------------------------------- */

                    messages: {
                        datepicker1: {
                            required: 'Select a Date'
                        },
                        entityName: {
                            required: 'Enter Entity name'
                        },
                        emailAddress: {
                            required: 'Enter email address',
                            email: 'Enter a VALID email address'
                        },
                        cicType: {
                            required: 'Enter communication type'
                        },
                        cicSubject: {
                            required: 'Enter communication subject'
                        },
                        cicBody: {
                            required: 'Enter communication body'
                        },
                        crcSystem: {
                            required: 'Enter source system'
                        }
                    },
                    /* @validation highlighting + error placement  
                     ---------------------------------------------------- */

                    highlight: function (element, errorClass, validClass) {
                        $(element).closest('.field').addClass(errorClass).removeClass(validClass);
                    },
                    unhighlight: function (element, errorClass, validClass) {
                        $(element).closest('.field').removeClass(errorClass).addClass(validClass);
                    },
                    errorPlacement: function (error, element) {
                        if (element.is(":radio") || element.is(":checkbox")) {
                            element.closest('.option-group').after(error);
                        } else {
                            error.insertAfter(element.parent());
                        }
                    },
                    submitHandler: function (form) {

                        //Get the values from the input fields
                        var entityName = $("#entityName").val();
                        var emailAddress = $("#emailAddress").val();
                        var cicType = $("#cicType").val();
                        var cicSubject = $("#cicSubject").val();
                        var cicBody = $("#cicBody").val();
                        var crcSystem = $("#crcSystem").val();
                        var timestamp = $("#datepicker1").val();

                        $.ajax({
                            url: "RegisterCicWeb",
                            data: {entityName: entityName, emailAddress: emailAddress, cicType: cicType, cicSubject: cicSubject, cicBody: cicBody, crcSystem: crcSystem, timestamp: timestamp},
                            success: function (result) {
                                //$("#feedBack").html("<div class=\"alert alert-success alert-dismissable\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button><i class=\"fa fa-check pr10\"></i><strong>Well done!</strong> You successfully read <a href=\"#\" class=\"alert-link\">this important alert message</a></div>");
                                alert(result);
                            },
                            error: function (data) {
                                if (typeof (fail) === 'function')
                                    $("#feedBack").html(data);
                            },
                            dataType: "html",
                            type: "POST"
                        });
                        //Cleare foarm fields after submit
                        $("#entityName").val("");
                        $("#emailAddress").val("");
                        $("#cicType").val("");
                        $("#cicSubject").val("");
                        $("#cicBody").val("");
                        $("#crcSystem").val("");
                        $("#datepicker1").val("");
                    }
                });

                /* Init datepicker
                 ------------------------------------------------------------------ */
                $("#datepicker1").datepicker({
                    changeMonth: true,
                    changeYear: true,
                    showButtonPanel: false,
                    altFormat: "yy-mm-dd",
                    dateFormat: "yy-mm-dd",
                    prevText: '<i class="fa fa-chevron-left"></i>',
                    nextText: '<i class="fa fa-chevron-right"></i>',
                    onClose: function () {
                        $("#datepicker1").trigger('blur');
                    },
                    beforeShow: function (input, inst) {
                        var newclass = 'admin-form';
                        var themeClass = $(this).parents('.admin-form').attr('class');
                        var smartpikr = inst.dpDiv.parent();
                        if (!smartpikr.hasClass(themeClass)) {
                            inst.dpDiv.wrap('<div class="' + themeClass + '"></div>');
                        }
                    }
                });


            });

        </script>
        <!-- END: PAGE SCRIPTS -->

    </body>
</html>
