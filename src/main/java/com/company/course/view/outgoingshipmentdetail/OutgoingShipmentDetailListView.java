package com.company.course.view.outgoingshipmentdetail;

import com.company.course.entity.OutgoingShipmentDetail;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "outgoingShipmentDetails", layout = MainView.class)
@ViewController(id = "OutgoingShipmentDetail.list")
@ViewDescriptor(path = "outgoing-shipment-detail-list-view.xml")
@LookupComponent("outgoingShipmentDetailsDataGrid")
@DialogMode(width = "64em")
public class OutgoingShipmentDetailListView extends StandardListView<OutgoingShipmentDetail> {
}