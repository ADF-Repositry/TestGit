package adf.hr.model.bc.vo.common;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 18 16:16:39 EET 2018
// ---------------------------------------------------------------------
public interface DepartmentsVO extends ViewObject {
    void masterDetail(String depName, String lastName, String email, Date hireDate, String jobID);
}

