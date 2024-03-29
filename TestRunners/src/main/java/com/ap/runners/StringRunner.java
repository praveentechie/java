package com.ap.runners;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class StringRunner {
    public static void main(String[] args) {
        StringRunner runner = new StringRunner();
        //runner.replaceAllOccurrence();
        //runner.test();
        runner.checkNullAndEmpty();
    }

    private void checkNullAndEmpty() {
        String nullValue = null;
        System.out.println("".concat("test").concat("new"));
        System.out.println(StringUtils.isBlank(nullValue));
        System.out.println(String.format("%s", nullValue));
    }

    public static void compareString() {
        String str1 = "";
        String str2 = null;
        System.out.println("compare with Object.equals() " + Objects.equals(str1, str2));
        System.out.println("compare with equals() " + str1.equals(str2));
    }

    private void replaceAllOccurrence() {
        String str1 = "string nbsp; test nbsp;";
        System.out.println("compare with Object.equals() " + str1.replace("nbsp;", "&#xA0;"));
    }

    private void test() {
        String css = "<style type=\"text/css\">/* Specific to pdf attachment */\n" + "@page {\n" + "    size: %s ;\n" +
              "}\n" + "\n" + "#reportContainer {\n" + "    width: max-content;\n" + "    margin: 0 auto;\n" + "}\n" +
              "\n" + "/* #reportContainer table td, #reportContainer table th {\n" + "  border-bottom: 1px solid;\n" +
              "}\n" + "#reportContainer table td:first-child, #reportContainer table th:first-child {\n" +
              "  border-top: 1px solid;\n" + "} */\n" +
              ".report-settings .filter-icon, .report-settings .search-filter {\n" + "    display: none;\n" + "  }\n" +
              "/* .report-settings span {\n" + "    margin-left: -1%;\n" + "} */\n" + ".action-container {\n" +
              "  display: none;\n" + "}\n" + "\n" + ".search-button {\n" + "  display: none;\n" + "}\n" + "\n" +
              "#reportContainer table {\n" + "  border: 1px solid;\n" + "}\n" +
              "#reportContainer table td, #reportContainer table th{\n" + "  border-bottom: 1px solid;\n" +
              "  border-right: 1px solid;\n" + "}\n" + "#reportContainer table tr:last-child td{\n" +
              "  border-bottom: 0px solid;\n" + "}\n" +
              "#reportContainer table td:last-child,#reportContainer table th:last-child{\n" + "  border-right: 0;\n" +
              "}\n" + "#reportContainer .selection-wrapper .filter-params .col-md-6.selection-title {\n" +
              "  display: inline-block;\n" + "  padding-right:15px;\n" + "}\n" +
              "#reportContainer .selection-wrapper .filter-params .col-md-12 .col-md-6 {\n" +
              "  padding-right:15px;\n" + "}\n" +
              "#reportContainer table tbody tr td,#reportContainer table tbody tr td.nowrap {\n" +
              "  white-space: nowrap;\n" + "}\n" + "#reportContainer table tbody tr td.wrap {\n" +
              "  white-space: normal;\n" + "}\n" + "#reportContainer table tbody tr td.left-align {\n" +
              "  text-align:left;\n" + "}\n" + "#reportContainer table tbody tr .right-align {\n" +
              "  text-align:right;\n" + "}\n" + "#reportContainer table tbody tr td.text-center {\n" +
              "  text-align:center;\n" + "}\n" + "#reportContainer table tbody tr.filter-row {\n" +
              "  display: none\n" + "}</style>";
        String html = new StringBuilder("<div class=\"container-fluid right-panel-reporting report-container check-custom-pagination\" " +
              "ng-class=\"{'check-custom-pagination': vm.showPaginationBar,'normal-pagination': !vm" +
              ".showPaginationBar,'show-left-bar': showLeftPanel}\" id=\"reportContainer\" data-qa-id=\"isiVV1r\" " +
              "style=\"\"><div class=\"m10-notification ng-isolate-scope\" " +
              "notification-target-id=\"reportNotificationPanel\" data-qa-id=\"fGUyNiU\"><!-- ngRepeat: alert in " +
              "notificationMessages | filter: notificationTargetFilterId: true --></div><div " +
              "class=\"report-action-wrapper\" data-qa-id=\"itpPe5t\"><h3 data-qa-id=\"isiVV1s\" " +
              "class=\"ng-binding\">On The Books</h3><div class=\"action-container\" data-qa-id=\"itpPeUG\"><!-- " +
              "ngIf: reportActions.exportable --><span ng-if=\"reportActions.exportable\" class=\"action-item " +
              "glyphicon glyphicon-export ng-scope disable-text\" ng-class=\"{'disable-text': !rawData.data.length}\"" +
              " ng-click=\"exportReport()\" title=\"Export as CSV\" data-qa-id=\"itpPe5u\" style=\"\"></span><!-- end" +
              " ngIf: reportActions.exportable --> <span class=\"action-print\" ng-click=\"printReport()\" " +
              "title=\"Print report\" data-qa-id=\"itpPeUK\"></span> <span class=\"settings\" " +
              "data-qa-id=\"ivjZizJ\"><!-- ngIf: vm.favorite.id --><button ng-if=\"vm.favorite.id\" class=\"hyperlink" +
              " scheduler-icon ng-scope\" title=\"Schedule\" ng-click=\"showSchedulers()\" data-qa-id=\"j344nZV\" " +
              "style=\"\"></button><!-- end ngIf: vm.favorite.id --> <!-- ngIf: vm.favorite.id --><button ng-if=\"vm" +
              ".favorite.id\" class=\"hyperlink scheduler-icon ng-scope\" title=\"Audit Logs\" " +
              "ng-click=\"showSchedulersAuditLogs()\" data-qa-id=\"j53UbTL\">12</button><!-- end ngIf: vm.favorite.id" +
              " --> <button class=\"hyperlink settings-icon\" title=\"Settings\" ng-click=\"showTableSettings()\" " +
              "data-qa-id=\"itwY3pS\"></button></span></div></div><!-- ngRepeat: reportTableParam in " +
              "reportTableParams --><div ng-repeat=\"reportTableParam in reportTableParams\" data-qa-id=\"ivjZizK\" " +
              "class=\"ng-scope\" style=\"\"><!-- ngIf: true --><div style=\"width: 100%\" class=\"report-settings " +
              "ng-scope\" ng-if=\"true\" data-qa-id=\"itwY39y\"><button class=\"filter-icon\" " +
              "ng-click=\"toggleFilterOptions(reportTableParam)\" ng-class=\"{'filter-open': reportTableParam" +
              ".showFilters}\" data-qa-id=\"itwY3pP\"></button><ag-input2 class=\"search-filter ng-scope\" " +
              "data-qa-id=\"itwY39z\"><ng-form class=\"w1-input2 ng-pristine ng-valid\" name=\"w1form\"> <input " +
              "class=\"form-control ng-pristine ng-untouched ng-valid ng-empty\" ng-class=\"{unambiguous: " +
              "displayPasswordIcon}\" ng-model=\"reportTableParam.searchText\" placeholder=\"Search table\" " +
              "data-qa-id=\"itwY39z-val\" autocomplete=\"off\"> <!-- ngIf: hasValue() --> <!-- ngIf: " +
              "displayPasswordIcon --></ng-form></ag-input2><button class=\"search-button ng-binding\" title=\"Go\" " +
              "ng-click=\"performSearch(reportTableParam.searchText, reportTableParam)\" " +
              "data-qa-id=\"ixTcZ5G\">Go</button> <!-- ngIf: ::reportTableParam.pageSeparatedBy --></div><!-- end " +
              "ngIf: true --><div class=\"report-wrapper\" data-qa-id=\"itpPeUw\"><div style=\"position:relative;" +
              "position:relative\" class=\"reports-table ng-isolate-scope\" ag-spinner=\"reportTableParam.isLoading\"" +
              " ag-spinner-opts=\"{&quot;color&quot;:&quot;#02aad0&quot;,&quot;lines&quot;:12,&quot;length&quot;:10," +
              "&quot;radius&quot;:12,&quot;width&quot;:5,&quot;top&quot;:&quot;50px&quot;}\" " +
              "data-qa-id=\"itpPeUx\"><div ng-show=\"showLoading\" class=\"spinner-container ng-hide\" " +
              "style=\"\"><div class=\"spinner\" role=\"progressbar\" style=\"position: absolute; width: 0px; " +
              "z-index: 2000000000; left: 50%; top: 50px;\"><div style=\"position: absolute; top: -2px; opacity: 0" +
              ".25; animation: 1s linear 0s infinite normal none running opacity-100-25-0-12;\"><div " +
              "style=\"position: absolute; width: 15px; height: 5px; background: rgb(2, 170, 208); box-shadow: rgba" +
              "(0, 0, 0, 0.1) 0px 0px 1px; transform-origin: left center; transform: rotate(0deg) translate(12px, " +
              "0px); border-radius: 2px;\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; " +
              "animation: 1s linear 0s infinite normal none running opacity-100-25-1-12;\"><div style=\"position: " +
              "absolute; width: 15px; height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px " +
              "0px 1px; transform-origin: left center; transform: rotate(30deg) translate(12px, 0px); border-radius: " +
              "2px;\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-2-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(60deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-3-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(90deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-4-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(120deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-5-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(150deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-6-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(180deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-7-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(210deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-8-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(240deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-9-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; ").append("transform-origin: left center; transform: rotate(270deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-10-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(300deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div><div style=\"position: absolute; top: -2px; opacity: 0.25; animation: 1s linear 0s " +
              "infinite normal none running opacity-100-25-11-12;\"><div style=\"position: absolute; width: 15px; " +
              "height: 5px; background: rgb(2, 170, 208); box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 1px; " +
              "transform-origin: left center; transform: rotate(330deg) translate(12px, 0px); border-radius: 2px;" +
              "\"></div></div></div></div><div ng-style=\"{ opacity: (showLoading ? '0' : '1')}\" ng-transclude=\"\" " +
              "style=\"opacity: 1;\"><table ng-table-dynamic=\"reportTableParam with baseHeader\" class=\"table " +
              "w8-list wrap-table-content table-striped stay-reporting-table ng-scope ng-table\" " +
              "template-header=\"customHeader.html\" ng-class=\"{disableTable:showLoading}\" " +
              "data-qa-id=\"itpPeUd\"><!-- ngInclude: templates.header --><thead ng-include=\"templates.header\" " +
              "class=\"ng-scope\"><!-- ngRepeat: headerLevel in headerLevels --><tr ng-repeat=\"headerLevel in " +
              "headerLevels\" data-qa-id=\"itpPe5v itpPeUN\" class=\"ng-scope\">\n" +
              "    <!-- ngRepeat: header in headerLevel --><!-- ngIf: header.show --><th ng-repeat=\"header in " +
              "headerLevel\" ng-if=\"header.show\" colspan=\"5\" class=\"group-end group-none odd nowrap\" " +
              "data-qa-id=\"itpPeUS\"></th><!-- end ngIf: header.show --><!-- end ngRepeat: header in headerLevel " +
              "--><!-- ngIf: header.show --><th ng-repeat=\"header in headerLevel\" ng-if=\"header.show\" " +
              "colspan=\"3\" class=\"group-end group-2 even nowrap\" data-qa-id=\"itpPeUS\">Transient</th><!-- end " +
              "ngIf: header.show --><!-- end ngRepeat: header in headerLevel --><!-- ngIf: header.show --><th " +
              "ng-repeat=\"header in headerLevel\" ng-if=\"header.show\" colspan=\"3\" class=\"group-end group-3 odd " +
              "nowrap\" data-qa-id=\"itpPeUS\">Group</th><!-- end ngIf: header.show --><!-- end ngRepeat: header in " +
              "headerLevel --><!-- ngIf: header.show --><th ng-repeat=\"header in headerLevel\" ng-if=\"header.show\"" +
              " colspan=\"14\" class=\"group-end group-4 even nowrap\" data-qa-id=\"itpPeUS\">Property</th><!-- end " +
              "ngIf: header.show --><!-- end ngRepeat: header in headerLevel -->\n" +
              "  </tr><!-- end ngRepeat: headerLevel in headerLevels -->\n" +
              "  <tr> <!-- ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
              "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
              ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
              "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
              "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header non-group group-end left-align " +
              "nowrap\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
              "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
              ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
              "class=\"ng-binding sort-indicator\">Category</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
              "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
              "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
              "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
              "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
              "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
              "isDate non-group group-end nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
              "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
              ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': ")
              .append("params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Date</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header non-group group-end right-align " +
                    "nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\"" +
                    " ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Rooms Total</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "non-group group-end right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Rooms Active</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header non-group group-end right-align " +
                    "nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\"" +
                    " ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Rooms Available</span> </div><!-- end ngIf: !template --> <!-- " +
                    "ngIf: template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns " +
                    "--><!-- ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ " +
                    "'sortable': $column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', " +
                    "'sort-desc': params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\"" +
                    " ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-2 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Rooms Sold</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-2 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Rooms Sold %</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-end group-2 even right-align nowrap\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Revenue</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-3 odd right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Rooms Sold</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-3 odd right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Picked-Up %</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-end group-3 odd right-align " +
                    "nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\"" +
                    " ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Revenue</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">OTM</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">OOO</span> </div><!-- end ngIf: !template --> <!-- ngIf: template " +
                    "--> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- ngIf: " +
                    "$column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Hold</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Departures (Rooms)</span> </div><!-- end ngIf: !template --> <!-- " +
                    "ngIf: template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns " +
                    "--><!-- ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ " +
                    "'sortable': $column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', " +
                    "'sort-desc': params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\"" +
                    " ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Arrivals (Rooms)" +
                    "</span> </div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show" +
                    "(this) --><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Adults</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Children</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
                    "class=\"ng-binding sort-indicator\">Day Use</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
                    "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
                    "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
                    "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
                    "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
                    "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
                    "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
                    "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
                    ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
                    "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Rooms Sold</span> " +
                    "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
                    "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
                    "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
                    ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
                    "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
                    "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap " +
                    "sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
                    "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
                    ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" ")
               .append(
              "class=\"ng-binding sort-indicator\">Comp Rooms</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
              "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
              "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
              "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
              "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
              "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
              "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
              "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
              ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
              "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">Occupancy %</span> " +
              "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
              "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
              "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
              ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
              "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
              "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-4 even right-align nowrap\">" +
              " <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header ng-scope\" " +
              "ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span ng-bind=\"$column" +
              ".title(this)\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='span'}\" " +
              "class=\"ng-binding sort-indicator\">Room Revenue</span> </div><!-- end ngIf: !template --> <!-- ngIf: " +
              "template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: $column in $columns --><!-- " +
              "ngIf: $column.show(this) --><th title=\"\" ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': " +
              "$column.sortable(this), 'sort-asc': params.sorting()[$column.sortable(this)]=='asc', 'sort-desc': " +
              "params.sorting()[$column.sortable(this)]=='desc' }\" ng-click=\"sortBy($column, $event)\" " +
              "ng-if=\"$column.show(this)\" ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header " +
              "group-4 even right-align nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" " +
              "class=\"ng-table-header ng-scope\" ng-class=\"{'sort-indicator': params.settings()" +
              ".sortingIndicator=='div'}\"> <span ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': " +
              "params.settings().sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">ADR</span> " +
              "</div><!-- end ngIf: !template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) " +
              "--><!-- end ngRepeat: $column in $columns --><!-- ngIf: $column.show(this) --><th title=\"\" " +
              "ng-repeat=\"$column in $columns\" ng-class=\"{ 'sortable': $column.sortable(this), 'sort-asc': params" +
              ".sorting()[$column.sortable(this)]=='asc', 'sort-desc': params.sorting()[$column.sortable(this)" +
              "]=='desc' }\" ng-click=\"sortBy($column, $event)\" ng-if=\"$column.show(this)\" " +
              "ng-init=\"template=$column.headerTemplateURL(this)\" class=\"header group-end group-4 even right-align" +
              " nowrap sortable\"> <!-- ngIf: !template --><div ng-if=\"!template\" class=\"ng-table-header " +
              "ng-scope\" ng-class=\"{'sort-indicator': params.settings().sortingIndicator=='div'}\"> <span " +
              "ng-bind=\"$column.title(this)\" ng-class=\"{'sort-indicator': params.settings()" +
              ".sortingIndicator=='span'}\" class=\"ng-binding sort-indicator\">RevPAR</span> </div><!-- end ngIf: " +
              "!template --> <!-- ngIf: template --> </th><!-- end ngIf: $column.show(this) --><!-- end ngRepeat: " +
              "$column in $columns --> </tr>\n" +
              "  <!-- ngIf: reportTableParam.showFilters --></thead><tbody data-qa-id=\"itpPeUh\"><!-- ngRepeat: " +
              "group in $groups --><!-- ngIf: $groups --><tr class=\"ng-table-group ng-scope\" ng-if=\"$groups\" " +
              "ng-click=\"group.$hideRows = !group.$hideRows;\" ng-repeat-start=\"group in $groups\" " +
              "ng-class=\"{'row-collapsed': group.$hideRows}\" data-qa-id=\"itpPeUu\" style=\"\"><!-- ngIf: " +
              "!hasHorizontalAggregation() --><!-- ngRepeat: header in baseHeader track by header.name --><!-- ngIf: " +
              "header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;&amp; " +
              "hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" ng-class=\"header" +
              ".class\" data-qa-id=\"iupuhFW\" class=\"ng-scope non-group group-end left-align nowrap\"><!-- ngIf: " +
              "$index === 0 --><span ng-if=\"$index === 0\" class=\"grouped-cell ng-scope\" " +
              "data-qa-id=\"ivcNV7f\"><span class=\"text-bold\" data-qa-id=\"itpPeUb\"><span class=\"toggle-icon " +
              "toggle-icon-open\" ng-class=\"{'toggle-icon-open': !group.$hideRows}\" " +
              "data-qa-id=\"itpPeUy\"></span></span> <b data-qa-id=\"ivcNV7g\" " +
              "class=\"ng-binding\">Bangalore</b></span><!-- end ngIf: $index === 0 --> <!-- ngIf: $index !== 0 " +
              "--></td><!-- end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in " +
              "baseHeader track by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td " +
              "ng-if=\"header.show &amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by " +
              "header.name\" ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope isDate non-group " +
              "group-end nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\"></b><!-- end ngIf: $index !== 0 --></td><!-- end " +
              "ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope non-group group-end right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">414</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope non-group group-end right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">414</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope non-group group-end right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">414</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-2 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">8</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-2 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">1.93</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-end group-2 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</b><!-- end ngIf: $index !== 0 " +
              "--></td><!-- end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in " +
              "baseHeader track by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td " +
              "ng-if=\"header.show &amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by " +
              "header.name\" ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-3 odd " +
              "right-align nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-3 odd right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0.00</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-end group-3 odd right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</b><!-- end ngIf: $index !== 0 " +
              "--></td><!-- end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in " +
              "baseHeader track by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td " +
              "ng-if=\"header.show &amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by " +
              "header.name\" ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">2</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">11</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">2</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">12</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">8</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0</b><!-- end ngIf: $index !== 0 --></td><!-- end" +
              " ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show &amp;" +
              "&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">1.93</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</b><!-- end ngIf: $index !== 0 " +
              "--></td><!-- end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in " +
              "baseHeader track by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td " +
              "ng-if=\"header.show &amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by " +
              "header.name\" ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0.00</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --><!-- ngIf: header.show && hasHorizontalAggregation() --><td ng-if=\"header.show " +
              "&amp;&amp; hasHorizontalAggregation()\" ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-class=\"header.class\" data-qa-id=\"iupuhFW\" class=\"ng-scope group-end group-4 even right-align " +
              "nowrap\"><!-- ngIf: $index === 0 --> <!-- ngIf: $index !== 0 --><b ng-if=\"$index !== 0\" " +
              "data-qa-id=\"ivcNVZP\" class=\"ng-binding ng-scope\">0.00</b><!-- end ngIf: $index !== 0 --></td><!-- " +
              "end ngIf: header.show && hasHorizontalAggregation() --><!-- end ngRepeat: header in baseHeader track " +
              "by header.name --></tr><!-- end ngIf: $groups --><!-- ngRepeat: data in group.data --><tr " +
              "ng-hide=\"group.$hideRows\" class=\"ng-table-items ng-scope\" ng-repeat-end=\"\" ng-repeat=\"data in " +
              "group.data\" ng-init=\"$last &amp;&amp; stopLoader(reportTableParam)\" data-qa-id=\"itpPeUz\" " +
              "style=\"\"><!-- ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Category\" class=\"ng-scope non-group group-end " +
              "left-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show" +
              " --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Date\" class=\"ng-scope isDate non-group group-end " +
              "nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">Aug 24, 2020</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Rooms Total\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !==" +
              " header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms " +
              "Active\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: horizontalGroup.name !==" +
              " header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms " +
              "Available\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: horizontalGroup.name " +
              "!== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold\" " +
              "class=\"ng-scope group-2 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">4</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold %\" class=\"ng-scope group-2 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1.93</span><!-- end ngIf:" +
              " horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Revenue\" class=\"ng-scope group-end group-2 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- end ngIf: horizontalGroup" +
              ".name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader " +
              "track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header" +
              ".name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms" +
              " Sold\" class=\"ng-scope group-3 odd right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header" +
              ".name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!--" +
              " end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: " +
              "header.show --><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" " +
              "ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Picked-Up %\" class=\"ng-scope " +
              "group-3 odd right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span " +
              "ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0" +
              ".00</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show " +
              "--><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Revenue\" class=\"ng-scope group-end group-3 odd " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- " +
              "end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end " +
              "ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"OTM\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"OOO\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup" +
              ".name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!--" +
              " end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: " +
              "header.show --><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" " +
              "ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Hold\" class=\"ng-scope group-4 " +
              "even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span " +
              "ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">1</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Departures (Rooms)\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">10</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Arrivals (Rooms)\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1</span><!-- end ngIf: horizontalGroup.name !== " +
              "header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Adults\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">6</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Children\" class=\"ng-scope group-4 even right-align" +
              " nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Day Use\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== " +
              "header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">4</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Comp Rooms\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Occupancy %\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1.93</span><!-- end ngIf: horizontalGroup.name " +
              "!== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by" +
              " header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Room " +
              "Revenue\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== " +
              "header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"ADR\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">0.00</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: " +
              "header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show " +
              "--><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"RevPAR\" class=\"ng-scope group-end group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0.00</span><!-- end ngIf:" +
              " horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --></tr><!-- end ngRepeat: data in group.data --><tr " +
              "ng-hide=\"group.$hideRows\" class=\"ng-table-items ng-scope\" ng-repeat-end=\"\" ng-repeat=\"data in " +
              "group.data\" ng-init=\"$last &amp;&amp; stopLoader(reportTableParam)\" data-qa-id=\"itpPeUz\"><!-- " +
              "ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Category\" class=\"ng-scope non-group group-end " +
              "left-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show" +
              " --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Date\" class=\"ng-scope isDate non-group group-end " +
              "nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">Aug 25, 2020</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Rooms Total\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !==" +
              " header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms " +
              "Active\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: horizontalGroup.name !==" +
              " header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms " +
              "Available\" class=\"ng-scope non-group group-end right-align nowrap\"><!-- ngIf: horizontalGroup.name " +
              "!== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">207</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold\" " +
              "class=\"ng-scope group-2 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">4</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold %\" class=\"ng-scope group-2 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1.93</span><!-- end ngIf:" +
              " horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Revenue\" class=\"ng-scope group-end group-2 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- end ngIf: horizontalGroup" +
              ".name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader " +
              "track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header" +
              ".name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms" +
              " Sold\" class=\"ng-scope group-3 odd right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header" +
              ".name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!--" +
              " end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: " +
              "header.show --><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" " +
              "ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Picked-Up %\" class=\"ng-scope " +
              "group-3 odd right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span " +
              "ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0" +
              ".00</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show " +
              "--><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Revenue\" class=\"ng-scope group-end group-3 odd " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- " +
              "end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end " +
              "ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td " +
              "ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"OTM\" class=\"ng-scope group-4 even right-align " +
              "nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"OOO\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup" +
              ".name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!--" +
              " end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: " +
              "header.show --><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" " +
              "ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Hold\" class=\"ng-scope group-4 " +
              "even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span " +
              "ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">1</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Departures (Rooms)\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Arrivals (Rooms)\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1</span><!-- end ngIf: horizontalGroup.name !== " +
              "header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Adults\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">6</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Children\" class=\"ng-scope group-4 even right-align" +
              " nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== " +
              "header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Day Use\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: horizontalGroup.name !== " +
              "header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by " +
              "header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Rooms Sold\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">4</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: header" +
              ".show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show --><td" +
              " ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"Comp Rooms\" class=\"ng-scope group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0</span><!-- end ngIf: " +
              "horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader " +
              "track by header.name\" ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" " +
              "data-title-text=\"Occupancy %\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: " +
              "horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup.name !== header.name\" " +
              "data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">1.93</span><!-- end ngIf: horizontalGroup.name " +
              "!== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by" +
              " header.name --><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"Room " +
              "Revenue\" class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== " +
              "header.name --><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" " +
              "class=\"ng-binding ng-scope\">₹&nbsp;0.00</span><!-- end ngIf: horizontalGroup.name !== header.name " +
              "--></td><!-- end ngIf: header.show --><!-- end ngRepeat: header in baseHeader track by header.name " +
              "--><!-- ngIf: header.show --><td ng-repeat=\"header in baseHeader track by header.name\" " +
              "ng-if=\"header.show\" ng-class=\"header.class\" data-qa-id=\"itpPeUk\" data-title-text=\"ADR\" " +
              "class=\"ng-scope group-4 even right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name " +
              "--><span ng-if=\"horizontalGroup.name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding " +
              "ng-scope\">0.00</span><!-- end ngIf: horizontalGroup.name !== header.name --></td><!-- end ngIf: " +
              "header.show --><!-- end ngRepeat: header in baseHeader track by header.name --><!-- ngIf: header.show " +
              "--><td ng-repeat=\"header in baseHeader track by header.name\" ng-if=\"header.show\" ng-class=\"header" +
              ".class\" data-qa-id=\"itpPeUk\" data-title-text=\"RevPAR\" class=\"ng-scope group-end group-4 even " +
              "right-align nowrap\"><!-- ngIf: horizontalGroup.name !== header.name --><span ng-if=\"horizontalGroup" +
              ".name !== header.name\" data-qa-id=\"itpPeUn\" class=\"ng-binding ng-scope\">0.00</span><!-- end ngIf:" +
              " horizontalGroup.name !== header.name --></td><!-- end ngIf: header.show --><!-- end ngRepeat: header " +
              "in baseHeader track by header.name --></tr><!-- end ngRepeat: data in group.data --><!-- end ngRepeat:" +
              " group in $groups --><!-- ngRepeat: tableData in $data --><!-- ngIf: !$groups && (!$data || !$data" +
              ".length) || vm.showNoData --></tbody></table><div ng-table-pagination=\"params\" " +
              "template-url=\"templates.pagination\" class=\"ng-scope ng-isolate-scope\"><!-- ngInclude: templateUrl " +
              "--><div ng-include=\"templateUrl\" class=\"ng-scope\"><!-- ngIf: params.data.length --><div " +
              "class=\"ng-table-pager ng-scope\" ng-if=\"params.data.length\" style=\"\"> <!-- ngIf: params.settings" +
              "().counts.length --><div ng-if=\"params.settings().counts.length\" class=\"ng-table-counts btn-group " +
              "pull-right ng-scope\"> <!-- ngRepeat: count in params.settings().counts --><button ng-repeat=\"count " +
              "in params.settings().counts\" type=\"button\" ng-class=\"{'active':params.count()==count}\" " +
              "ng-click=\"params.count(count)\" class=\"btn btn-default ng-scope\"> <span ng-bind=\"count\" " +
              "class=\"ng-binding\">10</span> </button><!-- end ngRepeat: count in params.settings().counts " +
              "--><button ng-repeat=\"count in params.settings().counts\" type=\"button\" ng-class=\"{'active':params" +
              ".count()==count}\" ng-click=\"params.count(count)\" class=\"btn btn-default ng-scope\"> <span " +
              "ng-bind=\"count\" class=\"ng-binding\">25</span> </button><!-- end ngRepeat: count in params.settings" +
              "().counts --><button ng-repeat=\"count in params.settings().counts\" type=\"button\" " +
              "ng-class=\"{'active':params.count()==count}\" ng-click=\"params.count(count)\" class=\"btn btn-default" +
              " ng-scope active\"> <span ng-bind=\"count\" class=\"ng-binding\">50</span> </button><!-- end ngRepeat:" +
              " count in params.settings().counts --><button ng-repeat=\"count in params.settings().counts\" " +
              "type=\"button\" ng-class=\"{'active':params.count()==count}\" ng-click=\"params.count(count)\" " +
              "class=\"btn btn-default ng-scope\"> <span ng-bind=\"count\" class=\"ng-binding\">100</span> " +
              "</button><!-- end ngRepeat: count in params.settings().counts --> </div><!-- end ngIf: params.settings" +
              "().counts.length --> <ul class=\"pagination ng-table-pagination\"> <!-- ngRepeat: page in pages --> " +
              "</ul> </div><!-- end ngIf: params.data.length --> </div></div><!-- ngIf: vm.showPager --><div " +
              "class=\"page-parent ng-scope\" ng-if=\"vm.showPager\" ng-class=\"{'disabled-click':vm.isclicked}\" " +
              "data-qa-id=\"izUVkbk\" style=\"\"><ul class=\"pagination pull-left\" data-qa-id=\"izUVm2Y\"><!-- ngIf:" +
              " vm.currentPage!==1 --><!-- ngIf: vm.firstPage && vm.splitedPage.length>1 --><!-- ngRepeat: page in vm" +
              ".splitedPage --><li ng-class=\"{'active':vm.currentPage===page}\" ng-repeat=\"page in vm.splitedPage\"" +
              " data-qa-id=\"izUVm63\" class=\"ng-scope active\"><a ng-click=\"vm.selectPageNumber(page," +
              "reportTableParam)\" href=\"\" class=\"ng-scope ng-binding\" data-qa-id=\"izUVm4S\">1</a></li><!-- end " +
              "ngRepeat: page in vm.splitedPage --><!-- ngIf: vm.lastPage && vm.splitedPage.length>1 --><!-- ngIf: vm" +
              ".lastPage && (vm.lastPage !== vm.currentPage) --></ul><!-- ngIf: vm.pageCount.length --><div " +
              "ng-if=\"vm.pageCount.length\" class=\"pull-right ng-scope\" data-qa-id=\"izUVm4A\"><!-- ngRepeat: " +
              "count in vm.pageCount --><button ng-repeat=\"count in vm.pageCount\" type=\"button\" " +
              "ng-class=\"{'active':vm.currentCount===count}\" ng-click=\"vm.selectCount(count)\" class=\"btn " +
              "btn-default ng-scope active\" data-qa-id=\"izUVm5W\"><span data-qa-id=\"izUVm6K\" " +
              "class=\"ng-binding\">50</span></button><!-- end ngRepeat: count in vm.pageCount --><button " +
              "ng-repeat=\"count in vm.pageCount\" type=\"button\" ng-class=\"{'active':vm.currentCount===count}\" " +
              "ng-click=\"vm.selectCount(count)\" class=\"btn btn-default ng-scope\" data-qa-id=\"izUVm5W\"><span " +
              "data-qa-id=\"izUVm6K\" class=\"ng-binding\">100</span></button><!-- end ngRepeat: count in vm" +
              ".pageCount --><button ng-repeat=\"count in vm.pageCount\" type=\"button\" ng-class=\"{'active':vm" +
              ".currentCount===count}\" ng-click=\"vm.selectCount(count)\" class=\"btn btn-default ng-scope\" " +
              "data-qa-id=\"izUVm5W\"><span data-qa-id=\"izUVm6K\" class=\"ng-binding\">150</span></button><!-- end " +
              "ngRepeat: count in vm.pageCount --></div><!-- end ngIf: vm.pageCount.length --></div><!-- end ngIf: vm" +
              ".showPager --></div></div></div></div><!-- end ngRepeat: reportTableParam in reportTableParams --></div>").toString();

        final Document document = Jsoup.parse(html);
        int columns = document.getElementsByAttributeValue("ng-repeat", "$column in $columns").size();
        int columnsWidth = columns * 3; // 3cm for each column
        columnsWidth = columnsWidth < 21 ? 21 : columnsWidth;
        String size = columnsWidth + "cm 29.35cm";
        System.out.println(String.format("<style type=\"text/css\">" + "\n@page {\n" + "size: %s;\n}" + "</style>", size));
    }
}
