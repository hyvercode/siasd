/**
 * 
 */
package com.alfazid.siasd.model;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;

/**
 * @author   mohirwanh@gmail.com
 * @web	     www.alfaz.id
 * @Date     Oct 20, 2019
 * @projects siasd @package com.alfazid.siasd.model
 */
public class CreatedAt {
	 @Basic
     @Column(name = "id_sekolah")
	 private int idSekolah;
	 @Basic
	 @Column(name = "active")
	 private String active;
	 @Basic
	 @Column(name = "user_created")
	 private Integer userCreated;
	 @Basic
	 @Column(name = "timestamp_created")
	 private Timestamp timestampCreated;
	 @Basic
	 @Column(name = "user_update")
	 private Integer userUpdated;
	 @Basic
	 @Column(name = "timestamp_update")
	 private Timestamp timestampUpdate;

}